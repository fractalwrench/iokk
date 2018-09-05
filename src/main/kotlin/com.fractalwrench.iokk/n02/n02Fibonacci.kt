package com.fractalwrench.iokk.n02

/**

###
#  #    # ##### ###### #####  #    #   ##   ##### #  ####  #    #   ##   #
#  ##   #   #   #      #    # ##   #  #  #    #   # #    # ##   #  #  #  #
#  # #  #   #   #####  #    # # #  # #    #   #   # #    # # #  # #    # #
#  #  # #   #   #      #####  #  # # ######   #   # #    # #  # # ###### #
#  #   ##   #   #      #   #  #   ## #    #   #   # #    # #   ## #    # #
### #    #   #   ###### #    # #    # #    #   #   #  ####  #    # #    # ######

#######
#     # #####  ###### #    #  ####   ####    ##   ##### ###### #####
#     # #    # #      #    # #      #    #  #  #    #   #      #    #
#     # #####  #####  #    #  ####  #      #    #   #   #####  #    #
#     # #    # #      #    #      # #      ######   #   #      #    #
#     # #    # #      #    # #    # #    # #    #   #   #      #    #
####### #####  #       ####   ####   ####  #    #   #   ###### #####

#    #
#   #   ####  ##### #      # #    #
#  #   #    #   #   #      # ##   #
###    #    #   #   #      # # #  #
#  #   #    #   #   #      # #  # #
#   #  #    #   #   #      # #   ##
#    #  ####    #   ###### # #    #

#####
#     #  ####  #    # ##### ######  ####  #####
#       #    # ##   #   #   #      #        #
#       #    # # #  #   #   #####   ####    #
#       #    # #  # #   #   #           #   #
#     # #    # #   ##   #   #      #    #   #
#####   ####  #    #   #   ######  ####    #


Challenge 2: Fibonacci Sequence

Your program should print the Fibonacci sequence to System.out, in the most convoluted manner
possible. The solution should print the first N numbers in the sequence. A passing test is provided.

When you're happy with your solution, open a PR with a copy of the file, with your GitHub username as a suffix for
the file, class, and method names. For example, n01HelloWorld would become n02Fibonacci_<username>.

Please also document how your monstrosity works using KDoc.
 */
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
