package com.fractalwrench.iokk.n01

/**
 * The program basically builds multiple list of optional lamdas, which encode a single char of "Hello, World!" in binary.
 * Each list ist then first converted to an integer and then to a char,
 * in the end all chars are concatenated to get the final "Hello, World!" string.
 *
 * Additionally to make the program a bit harder to figure out all identifiers are just brackets.
 */


/**
 * Placeholder for an empty lambda
 */
val `)` = {}

/**
 * Placeholder for null
 *
 * The if statement is just a way for getting IntelliJ not to complain later on, that this statement is always null
 */
val `}` = if (`)` == `)`) null else `)`

typealias `)(` = Unit
typealias `=` = () -> `)(`

/**
 * Optional lambda: ( () -> Unit )?
 */
typealias `(` = `=`?

/**
 * Array of optional lambdas: Array<( () -> Unit )?>
 */
typealias `))` = Array<`(`>

/**
 * Concatenate an array with the provided optional lambda
 **
 * @param `(` Array of optional lambdas that is appended
 * @param `((` An optional lambda that is appended to the array
 * @return Array that contains all values from [`(`] and [`((`]
 */
fun `{`(`(`: `))` = `))`(`"`()) { {} }, `((`: `(` = `}`) = `(` + `((`

/**
 * Same as [`{`] function with reversed parameters
 */
fun `{{`(`((`: `(` = `}`, `(`: `))` = `))`(`"`()) { {} }) = `{`(`(`, `((`)

/**
 * Optional lambda to 0 or 1
 *
 * @param `(` An optional lambda
 * @return 0 if [`(`] is null else 1
 */
fun `"`(`(`: `(` = `}`) = `(`?.let { 1 } ?: 0

/**
 * Int to Char
 *
 * Since calling .toChar() would be to easy, create a list that is as long as the value of the int and then use that
 * to fold the char starting at 0x00 and increase it by one for each element in the list
 *
 * @param `!` Integer representing the char
 * @return The character
 */
val `{(` = { `)`: Int -> (`"`()..(`)`) - `"`{}).fold('\u0000') { `(`, _ -> `(`.inc() } }

/**
 * Array of optional lambdas to array of char
 *
 * This lambda function takes in the array of optional lambdas and maps it to an array of 0 or 1,
 * after that the int array is folded by binary shifting and xor'ing the bits of the char,
 * in the end the int is transformed to a char given the previous function
 *
 * @param `(` An array of Array<( () -> Unit )?> representing the bits
 * @return The char represented by the array
 */
val `((` = { `(`: `))` -> `(`.map { `)` -> `"`(`)`) }.fold(`"`()) { `((`, `)` -> `((`.shl(`"`{}) xor `)` }.let { `)` -> `{(`(`)`) } }

/**
 * List of char to string
 *
 * Takes in a list of arrays of optional lambdas, converts them into chars using the [`((`] function and folds them into a string
 *
 * @param `)` vararg list of objects that are folded together
 * @return String representation of input list
 */
fun ` `(vararg `)`: `))`) = `)`.map { `(` -> `((`(`(`) }.fold("") { `(`, `))` -> `(` + `))` }

fun `))`() = `{`(`{`(`{`()){}){}
fun `}}`() = `{`(`{`())
fun `((`() = `{`(`{`(`))`()))
fun `{{`() = `{`(`{`(`))`())){}

/**
 * Putting it all together this val contains the "Hello, World!" string
 */
val ` ` = ` `(
        `{`(`{`(`{`(`{{`({},`{`(`{`(`{`(`{`()){})))))),
        `{`(`{`(`{{`({},`((`()))){},
        `{`(`{`(`{`(`{{`()){})),
        `{`(`{`(`{{`({},`{`(`{`(`))`())){}))),
        `{{`({},`{`(`{`(`{{`()){}){}),
        `{`(`{`(`{{`({},`{{`({},`{`(`{`(`{`(`{`())){}))))),
        `{`(`{`(`{`(`{`(`{`(`{`(`}}`()){}))))),
        `{{`({},`{`(`{`(`{`(`{{`({},`{`(`{`(`{`()){})))){}){}),
        `{`(`{{`({},`{`(`{{`()){})){},
        `{`(`{`(`{`(`{`(`{`(`))`()){}))){}),
        `{`(`{`(`{`(`{{`({},`{`(`))`()))){})),
        `{`(`{`(`{`(`((`()){})),
        `{{`({},`{`(`{`(`{`(`{`(`{`(`}}`()){})))))
)

fun ch1Solution_machtelik() {
    println(` `)
}