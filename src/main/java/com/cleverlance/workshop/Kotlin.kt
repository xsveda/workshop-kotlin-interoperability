@file:JvmName("Kotlin")

package com.cleverlance.workshop

fun unitFunction() {
}

fun intFunction(a: Int, b: Int?): Int? {
    return 0
}

fun listFunction(): List<String> {
    return emptyList()
}

fun mutableListFunction(): MutableList<String> {
    return mutableListOf()
}

val readOnlyProperty: String = ""
var mutableProperty: String = ""

suspend fun doSomethingAsync(input: String): Int {
    return 0
}

fun main() {
    Java.voidFunction()

    Java.intFunction(0, 0)?.toLong() ?: error("Function did not return value")

    Java.listFunction().add("")
    //listFunction().add("")
    mutableListFunction().add("")

    Java().field
    Java().property = ""
    //readOnlyProperty = ""
    mutableProperty = ""

    //doSomethingAsync("")
}

suspend fun anotherMain() {
    doSomethingAsync("1")
    doSomethingAsync("2")
    doSomethingAsync("3")
}
