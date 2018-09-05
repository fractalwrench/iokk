package com.fractalwrench.iokk.n02

import com.fractalwrench.iokk.captureStdOut
import org.junit.Assert.assertEquals
import org.junit.Test

class N02FibonacciTest {

    @Test
    fun testFibonacci() {
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]\n", captureStdOut { ch2Solution(10) })
        assertEquals("[0, 1, 1, 2, 3, 5]\n", captureStdOut { ch2Solution(5) })
    }

}
