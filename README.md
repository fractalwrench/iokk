# International Obfuscated Kotlin Contest

Do you have a coworker who writes the most incomprehensible Kotlin code you've ever seen? Have you inherited such an utter mess of a codebase that it deserves its [very own Wikipedia article](https://en.wikipedia.org/wiki/Undeciphered_writing_systems)? Then this repository is for you! 

The aim of this contest is to pass the tests for each challenge, by writing the most convoluted Kotlin programs possible.

## An example

For example, consider the innocent Hello World program:

```
println("Hello World")
```

Submissions to the contest should look more like this:

```
val `_^`: Byte = 27
val `)`: Byte = (11.1 * 10).toByte()
val WAT = byteArrayOf(72, 101, 54 * 2, (`_^` * 4).toByte(), `)`, 44, 32, 87, `)`, 114, 27 * 4, 100, 33)
println(String(WAT))
```

But obviously, as that is just an example, submissions should be much, much more incomprehensible.

## Submitting a solution

Fork the repository, read the current challenge, and pass the tests with your obfuscated code. 

When you're happy with your solution, open a PR with a *copy* of the file, with your GitHub username as a suffix for the file, class, and method names. For example, `n01HelloWorld` would become `n01HelloWorld_<username>`.

Please document how your monstrosity works using KDoc. An example of a submission is shown [here](src/main/kotlin/com/fractalwrench/iokk/n01/n01HelloWorld_fractalwrench.kt)

## Judging

After around a month has passed, submissions will be closed, and the top entries will make it into the [Hall of Infamy](#hall-of-infamy).

Points will be given for:

- Degree of incomprehensibility
- Abuse of Kotlin syntax, such as extension functions, operator overloads, and stdlib methods 
- Originality and clever hacks

The next challenge will then be opened for submissions. Stay tuned by watching the repository, as a new release will be used to notify everyone. 




## Improving the contest

Open an issue if you have a suggestion for a new challenge, or think the contest could be better by changing something. It's early days and I'm open to ideas.


## Hall of Infamy

_Coming soon..._


