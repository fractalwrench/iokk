# Challenge 01 - Hello World

A quick recap on the rules is available [here](README.md). For the unfamiliar, the aim of the game is to write a Kotlin program that solves a relatively trivial problem, using the most convoluted solution possible.

For this challenge, the program should write the string `'Hello, World!'` to `System.out`. In unobfuscated Kotlin, the solution would look something like this:

```
fun main(args: Array<String>) {
    println("Hello, World!")
}
```

## Entries

We received 5 great entries for this challenge, and all the authors have been added to [the Hall of Infamy](README.md#hall-of-infamy). Without further ado, here are the entries, and an attempt to explain how on earth they work.

### Kotlin DSL for Brainfuck

Our first entry is a [Kotlin DSL for Brainfuck](https://github.com/fractalwrench/iokk/pull/5), written by [westonal](https://github.com/westonal).

True to its name, this entry makes my head hurt trying to understand it. It abuses [operator overriding](https://kotlinlang.org/docs/reference/operator-overloading.html) to implement loops, and [extension properties](https://kotlinlang.org/docs/reference/extensions.html) to implement functions.

This all adds up to create possibly the most confusing DSL ever created within Kotlin. It really has to be seen to be believed. Use it in production today by copy pasting from [here](https://github.com/fractalwrench/iokk/pull/5)!

### Emojiianal abuse

The [next entry](https://github.com/fractalwrench/iokk/pull/3) by [Naaate](https://github.com/Naaate) makes great use of Unicode emoji, which can form valid Kotlin identifiers:

```
val `😘` = 42
```

[Infix functions](https://kotlinlang.org/docs/reference/functions.html#infix-notation) and [type aliases](https://kotlinlang.org/docs/reference/type-aliases.html) serve to further obfuscate the remaining code. This entry is 👌

### Syntax Inversion

[This entry](https://github.com/fractalwrench/iokk/pull/1) by [swankjesse](https://github.com/swankjesse) uses a very clever approach to flip Kotlin's on its head, by passing the argument first and method name last.

```
fun ch1Solution_swankjesse() {
  `Hello, World!`("println")
}

fun `Hello, World!`(vararg args: Any?) {
  for (p in System.getProperties().values) {
    for (j in p.toString().split(":")) {
      try {
        for (e in java.util.zip.ZipFile(j).entries()) {
          try {
            val n = e.name.substring(0 until e.name.length - 6).replace('/', '.')
            val c = Class.forName(n, false, object : Any() {}.javaClass.classLoader)
            val m = c.getDeclaredMethod(args[0].toString(), Any::class.java)
            m.isAccessible = true
            m.invoke(null, Exception().stackTrace[0].methodName)
          } catch (t: Throwable) {
          }
        }
      } catch (t: Throwable) {
      }
    }
  }
}
```

This works by finding the `println` method via reflection, then invoking it with the current method name, which is obtained by inspecting a stacktrace.

### More parentheses than Lisp
[This entry](https://github.com/fractalwrench/iokk/pull/4) by [machtelik](https://github.com/machtelik) uses more parentheses than the average Lisp program, [if such a thing is possible](https://xkcd.com/297/). It cleverly exploits optional lambdas to encode "Hello World" in binary, then ultimately converts everything back to a String, which is printed to screen.

### Operator overloading, extension functions, ASCII

Our [last entry](https://github.com/fractalwrench/iokk/pull/2) by [jamiesanson](https://github.com/jamiesanson) abuses extension functions, operator overloading, and good old-fashioned ASCII codes to achieve its goal. Conclusive proof that for Kotlin, security through obfuscation sometimes does work!

## Next Challenge

Ready for the next challenge? You can check out the entries or get started on submitting a solution [here](CH2.md).

Open an issue if you have a suggestion for a new challenge, or think the contest could be better by changing something.

It's early days and I'm open to ideas.
