package com.fractalwrench.iokk.n01

/**
 * This one flips the parameter and its argument without repeating either in the method body.
 */
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

fun main(args: Array<String>) {
  ch1Solution_swankjesse()
}
