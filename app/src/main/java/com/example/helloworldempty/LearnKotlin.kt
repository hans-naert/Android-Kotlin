package com.example.helloworldempty

import kotlin.math.max

fun main() {
    var a: Int=10
    a=a*10;
    println("Hello Kotlin, a= "+a)

    a = 37
    val b = 40
    val value = largerNumber(a, b)
    println("larger number is " + value)

    val range = 0 until 10
    for(i in range)
        println(i)

    val p=Person()
    p.name="Jack"
    p.age=19
    p.eat()

    val student = Student("a123", 5)
    val student2 = Student("a123", 5)
    student.eat()
    doStudy(student)

    val s:Study=student2;
    println(student2)
    println(student)
    println(s)
    println(p)

    val set = mutableSetOf("Apple", "Banana", "Orange", "Pear", "Grape")
    set.add("Lemon")
    set.add("Apple")
    for (fruit in set) {
        println(fruit)
    }

    val maxLengthFruit = set.maxBy { it.length }
    println("maxLengthFruit is ${maxLengthFruit}")

    Thread {
        println("Thread is running")
    }.start()

    getTextLength(null)

    printParams(str = "world")

}

fun largerNumber(num1: Int, num2:Int): Int {
    return max(num1, num2)
}

fun doStudy(study: Study?) {
    study?.readBooks()
    study?.doHomework()
}

fun getTextLength(text: String?) = text?.length?: 0

fun printParams(num: Int = 100, str: String) {
    println("num is $num , str is $str")
}