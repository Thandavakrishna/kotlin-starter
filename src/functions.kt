// Functions need not be part of a class. 'fun' keyword. Can have default parameters, named parameters - can check what parameters are passed
// 'extend' existing types
// No void type, hence need not explicitly specify return type
// Function expressions - functions reduced to single line of code
// Use annotation - @file:JvmName(<>) in order to use different name than kotlin file name everywhere.
// java does not support default parameters, so add @JvmOverloads annotation to generate method with default parameters
// Using named parameters, order does not matter. Helps when there are many parameters to see values passed. Cannot have only numbers once a named parameter is used.
// Extension functions - can 'add' functions to classes not owned by you. Kotlin generates static functions. Cuts down on Utility classes or helper classes. Makes code easier to read
// Infix functions - Member or extension function, has one parameter. Helps with operator loading. Use minimally
// Tail Recursive functions - Calling recursive functions can blow up stack. Use this to get around that. 'tailrec'. optimises away from recursion and changes into looping internally

@file:JvmName("DisplayFunctions")

fun main(args: Array<String>) {
    display("Hello, World!")
    println(max(2, 3))
    log("Hello, World!")
    log(message = "Hello, World!", loglevel = 3)
}

fun display(message: String) : Boolean{
    println(message)
    return true
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1) {
    println(message + loglevel)
}

fun max(a:Int, b:Int) : Int = if (a > b) a else b




