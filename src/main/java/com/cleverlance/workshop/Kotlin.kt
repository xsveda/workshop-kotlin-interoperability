@file:JvmName("Kotlin")

package com.cleverlance.workshop

fun unitFunction() {
}

fun intFunction(a: Int, b: Int?): Int? {
    return 0
}

fun main() {
    Java.voidFunction()

    Java.intFunction(0, 0)?.toLong() ?: error("Function did not return value")
}
