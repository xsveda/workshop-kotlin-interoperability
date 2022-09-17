@file:JvmName("Kotlin")

package com.cleverlance.workshop

fun unitFunction() {
}

@Throws(Exception::class)
fun nothingFunction(): Nothing {
    throw Exception()
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

sealed interface Animal {
    class Dog(val lives: Boolean) : Animal
    object Dinosaur : Animal
}

fun animals() {
    val animal: Animal = Animal.Dinosaur

    when (animal) {
        is Animal.Dog -> println("Dog ${animal.lives}")
        is Animal.Dinosaur -> println("Dinosaur")
        else -> println("There is no else")
    }
}
