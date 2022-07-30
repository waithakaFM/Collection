package com.rsk

fun main(args: Array<String>) {
    val item = IntArray(2)
    item[0] = 1
    item[1] = 2

//    initialize array of numbers
    val numbers = intArrayOf(1, 2, 3, 4)

    numbers.forEachIndexed { index, element ->
        println("$index is: $element")
    }
}