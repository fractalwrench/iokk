package com.fractalwrench.iokk.n01

//Do a little pre obfuscation
typealias `🧠` = Any
typealias `🤣` = Int
typealias `🤔` = IntRange
typealias `🍏` = String
typealias `🤯` = Unit
typealias `✅` = () -> `🍏`

/**
 * Abuse of infix functions, type aliases, and emoji lead to this awesomeness
 */
fun ch1Solution() {
    `🖕`().`👌`()
}


class `🖕`(){
    val `😘` = 32..114 `🤮` { it - 32 }

    fun `👌`() =
            ((40 `😂` 69).`😂`(76,2) `😂` 79 `😂` 12 `😂` 0 `😂` 55 `😂` 79 `😂` 82 `😂` 76 `😂` 68 `😂` 1).`👙` `💯` ::`🖨️`

    /**
     * takes an `🤣` and returns a `✅` that looks up the value for each `🤣`, converts them to chars and returns them as
     * `🍏`
     *
     * Once again,
     *
     * takes an Int and returns a () -> String that looks up the value for each Int, converts them to chars and returns
     * them as String
     */
    private infix fun `🤣`.`😂`( `😍`: `🤣`): `✅` = {
        (::`🍅` `💩`  `😘`[this]!!) +
                (::`🍅` `💩` `😘`[`😍`]!!)
    }

    /**
     * returns `✅` that calls receiving `✅` before looking up, converting to char, and appending`😍`
     *
     * returns () -> String that calls receiving () -> String before looking up, converting to char, and appending the
     * Int parameter
     */
    private infix fun `✅`.`😂`( `😍`: `🤣`): `✅` = {
        this.`👙` + (::`🍅` `💩` `😘`[`😍`]!!)
    }

    /**
     * calls 👆 that one `😙` number of times
     */
    private fun `✅`.`😂`( `😍`: `🤣`, `😙`: `🤣`): `✅` {
        var `🍍` = this
        var `🍌` = `😙`
        while(`🍌` > 0){
            `🍌` --
            `🍍` = `🍍` `😂` `😍`
        }

        return`🍍`
    }

    /**
     * Int.toChar().toString()
     */
    private infix fun `🍅`(`😍`: `🤣`) = `😍`::toChar.`👙`::toString.`👙`

    /**
     * IntRange.associateBy
     */
    private infix fun `🤔`.`🤮`(`🧐`: (`🤣`) -> `🤣`) = associateBy(`🧐`)

    /**
     * String.let
     */
    private infix fun `🍏`.`💯`(`🧐`: (`🍏`) -> `🤯`) = let(`🧐`)

    /**
     * println
     */
    private infix fun `🖨️` (`🧐`: `🍏`): `🤯` = println(`🧐`)

    /**
     * infix fun <T: Any, U: Any > ((T) -> u).`💩`(param: T) = this(param)
     *
     * because who directly calls things these days?
     */
    private infix fun <`🐙`: `🧠`, `👽`: `🧠` > ((`🐙`) -> `👽`).`💩`(`🤑`: `🐙`) = this(`🤑`)

    /**
     * val <T: Any> (() -> T).`👙` : T
     *
     * makes functions with no parameters callable by accessing .`👙`
     *
     * because empty brackets are boring
     */
    val <`🐙`: `🧠`> (() -> `🐙`).`👙` : `🐙`
        get() = this()

}