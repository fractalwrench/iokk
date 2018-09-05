# Challenge 02 - TODO

A quick recap on the rules is available [here](README.md). For the unfamiliar, the aim of the game is to write a Kotlin program that solves a relatively trivial problem, using the most convoluted solution possible.

The program should print the Fibonacci sequence to System.out, to the first N numbers in the sequence.

In unobfuscated Kotlin, the solution would look something like this:

```
fun main(args: Array<String>) {
    ch2Solution(15)
}

fun ch2Solution(number: Int) {
    var a = 0
    var b = 1
    var c: Int
    val numbers = mutableListOf(a, b)

    for (k in 0 until number - 1) {
        c = b + a
        a = b
        b = c
        numbers.add(c)
    }
    println(numbers)
}
```

## Entries

This challenge is open for entries! Check out the rules on how to submit in the [README](README.md).
