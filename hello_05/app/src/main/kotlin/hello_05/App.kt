/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package hello_05

import com.mine.Utils

class App {
    val greeting: Int
        get() {
            return Utils.add(2, 3)
        }
}

fun main() {
    println(App().greeting)
}