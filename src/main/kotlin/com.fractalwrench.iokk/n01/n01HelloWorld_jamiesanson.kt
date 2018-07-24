package com.fractalwrench.iokk.n01

/**
 * Ascii codes, operator overloading and extension functions with weird naming
 * can lead to some pretty convoluted code
 */
fun ch1Solution_jamiesanson() {
    fun Int.`$`(`-`: Int = -1): Int = when (this) {
        72 -> 101
        108 -> when (`-`) {
            114 -> 100
            108 -> 111
            else -> 108
        }
        111 -> when (`-`) {
            87 -> 114
            else -> 32
        }
        32 -> 87
        87 -> 111
        100 -> 33
        else -> 108
    }

    fun String.`(`(): Int = this.last().toInt()
    fun Int.`)`(): Char = this.toChar()

    fun String.`?`(`-`: Int = 0): Int = length - `-`
    fun String.`!`(): Int = when {
        `?`() > 2 -> this[`?`(2)].toInt()
        else -> -1
    }


    operator fun String.inc(): String = this + `(`().`$`(this@inc.`!`()).`)`()
    operator fun String.invoke(): String {
        var `-` = this
        when (`(`()) {
            33 -> println(this)
            else -> `-`++
        }

        return `-`
    }

    "H"()()()()()()()()()()()()
}
