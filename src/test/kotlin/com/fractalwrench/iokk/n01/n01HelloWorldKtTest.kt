package com.fractalwrench.iokk.n01

import com.fractalwrench.iokk.captureStdOut
import org.junit.Assert.assertEquals
import org.junit.Test

class N01HelloWorldTest {

    @Test
    fun testHelloWorld() {
        assertEquals("Hello, World!\n", captureStdOut(::ch1Solution))
    }

}
