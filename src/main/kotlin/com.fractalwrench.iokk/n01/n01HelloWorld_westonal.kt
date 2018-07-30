package com.fractalwrench.iokk.n01

/**
 * Brainfuck for Kotlin
 *
 * https://en.wikipedia.org/wiki/Brainfuck
 *
 * This is not a BF interpreter, but a DSL that allows you to write BF within kotlin.
 *
 * Specific kotlin features that I have (ab)used include:
 * - indexing operator overriding to give me BF loops
 * - extension properties for the BF functions
 * - lambdas outside parenthesis for my own shorthand syntax
 */

fun main(args: Array<String>) {
    ch1Solution_westonal()
}

/**
 * Contains a Brainfuck for Kotlin implementation of this BF program:
 * https://en.wikipedia.org/wiki/Brainfuck
 *
 * -[------->+<]>-.-[->+++++<]>++.+++++++..+++.[->+++++<]>+.
 * ------------.---[->+++<]>.-[--->+<]>---.+++.------.--------.
 * -[--->+<]>.
 */
fun ch1Solution_westonal() {
    val helloWorld =
             s[s { 7 }.r.a.l].r.s.o         //-[------->+<]>-.
            .s[s.r.a { 5 }.l].r.a.a.o       //-[->+++++<]>++.
            .a { 7 }.o.o                    //+++++++..
            .a { 3 }.o[s.r.a { 5 }.l].r.a.o //+++.[->+++++<]>+.
            .s { 12 }.o                     //------------.
            .s { 3 }[s.r.a { 3 }.l].r.o     //---[->+++<]>.
            .s[s { 3 }.r.a.l].r.s { 3 }.o   //-[--->+<]>---.
            .a { 3 }.o                      //+++.
            .s { 6 }.o                      //------.
            .s { 8 }.o                      //--------.
            .s[s { 3 }.r.a.l].r.o           //-[--->+<]>.

    // The program does't run until supplied a machine to run on
    helloWorld.run(MachineState()).let(System.out::println)
}

/**
 * A BF [Program] maps one immutable [MachineState] to the next state.
 */
typealias Program = (MachineState) -> MachineState

/**
 * bf +
 * Add one to [MachineState.current]
 */
val Program.a: Program
    get() = { m ->
        this(m).add()
    }

/**
 * bf -
 * Subtract one from [MachineState.current]
 */
val Program.s: Program
    get() = { m ->
        this(m).subtract()
    }

/**
 * bf >
 * Move data pointer right
 */
val Program.r: Program
    get() = { m ->
        this(m).moveRight()
    }

/**
 * bf <
 * Move data pointer left
 */
val Program.l: Program
    get() = { m ->
        this(m).moveLeft()
    }

/**
 * bf .
 * output [MachineState.current] as an ASCII character to the [MachineState.output]
 */
val Program.o: Program
    get() = { m ->
        this(m).output()
    }

/**
 * Identity [Program], use as a starting point.
 * You can use the [s] and [a] identity functions also.
 */
val I: Program = { machine -> machine }

/**
 * Starting point for a subtract
 */
val s = I.s

/**
 * Starting point for an add
 */
val a = I.a

/**
 * Helper that executes a [Program] against a [MachineState] and returns the [MachineState.output]
 */
fun Program.run(machineState: MachineState) = this(machineState).output

/**
 * This is a shorthand notation
 * .a{5} -> a.a.a.a.a
 */
inline fun Program.a(crossinline loops: () -> Int): Program =
        { m ->
            var next = this(m)
            for (i in 1..loops()) {
                next = next.add()
            }
            next
        }

/**
 * This is a shorthand notation
 * .s{5} -> .s.s.s.s.s
 */
inline fun Program.s(crossinline loops: () -> Int): Program =
        { m ->
            var next = this(m)
            for (i in 1..loops()) {
                next = next.subtract()
            }
            next
        }

/**
 * This is a shorthand notation for use at the start of a program
 * a{5} -> a.a.a.a.a
 */
fun a(loops: () -> Int) = I.a(loops)

/**
 * This is a shorthand notation for use at the start of a program
 * s{5} -> s.s.s.s.s
 */
fun s(loops: () -> Int) = I.s(loops)

/**
 * Loop, bf []
 */
operator fun Program.get(body: Program): Program =
        { m ->
            var next = this(m)
            while (next.current != 0) {
                next = body(next)
            }
            next
        }

data class MachineState(
        private val before: List<Int> = emptyList(),
        private val after: List<Int> = emptyList(),
        val current: Int = 0,
        val output: String = ""
) {
    fun add() = add(1)

    fun subtract() = add(255)

    fun moveRight() = copy(
            before = before + listOf(current),
            current = after.firstOrNull() ?: 0,
            after = after.drop(1)
    )

    fun moveLeft() = copy(
            before = before.dropLast(1),
            current = before.lastOrNull() ?: 0,
            after = listOf(current) + after
    )

    fun output() = copy(output = output + current.toChar())

    private fun add(n: Int) = copy(current = (current + n) % 256)
}
