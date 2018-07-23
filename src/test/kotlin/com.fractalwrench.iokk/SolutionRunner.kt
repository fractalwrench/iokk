package com.fractalwrench.iokk

import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Executes an arbitrary function, and returns any values sent to stdout as a String.
 */
fun captureStdOut(solution: () -> Unit): String {
    val baos = ByteArrayOutputStream()
    System.setOut(PrintStream(baos))
    solution()
    return String(baos.toByteArray(), Charsets.UTF_8)
}
