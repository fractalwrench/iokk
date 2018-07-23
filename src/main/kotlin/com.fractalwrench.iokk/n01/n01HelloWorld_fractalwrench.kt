package com.fractalwrench.iokk.n01

/**
 * Constructs a byte array with the numeric codes for each character in the 'Hello World' string.
 * Further obfuscation is achieved through unusual symbols in identifiers and pointless arithmetic.
 *
 * This is considered very lightweight obfuscation - and is more an example than an actual submission. If you're
 * looking for inspiration, try checking out the C equivalent of this contest (which is in no way officially related):
 * https://www.ioccc.org/
 */
fun ch1Solution_fractalwrench() {
    val `_^`: Byte = 27
    val `)`: Byte = (11.1 * 10).toByte()
    val bytes = byteArrayOf(72, 101, 54 * 2, (`_^` * 4).toByte(), `)`, 44, 32, 87, `)`, 114, 27 * 4, 100, 33)
    println(String(bytes))
}
