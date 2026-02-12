package com.example.learnkotlin

import android.util.Log.i
import org.junit.Test
import kotlin.math.max

class LearnKotlin {
    fun largerNumber(a: Int, b: Int): Int {
        return max(a, b)
    }

    fun largerNumber2(a: Int, b: Int): Int = max(a, b)

    fun largerNumber3(a: Int, b: Int) : Int {
        var value = 0;
        value = if(a > b) a else b
        return value
    }

    fun largerNumber4(a: Int, b: Int) = if(a > b) a else b

    fun getScore(name: String): Int {
        return when(name) {
            "Alice" -> 90
            "Bob" -> 80
            "Charlie" -> 70
            else -> 0
        }
    }

    open class Person(val geboorteplaats :String) {
            var name: String = ""
            var age: Int = 0
            fun eat() {
                println("$name is eating and is $age years old")
            }
    }

    interface Study {
        fun ReadBooks()
        fun DoHomeWork()
    }

    class Student(geboorteplaats: String,val fase:String="fase 1"): Person(geboorteplaats), Study {
        var sno: String = "";
        var grade: Int=0;

        init {
            println("student initialiazation")
        }

        constructor(): this("unknown") {
            println("secondary constructor")
        }

        override fun DoHomeWork() {
            println("$name is doing homework")
        }

        override fun ReadBooks() {
            println("$name is reading books")
        }
    }

    fun Read(study: Study)
    {
        study.ReadBooks()
    }

    @Test
    fun test() {
        var a : Int = 10
        val b = 2
        a=a*10;
        println("larger number is ${largerNumber(a, b)}")
        println("a + b = ${a + b}")

        for(i in 1..5) {
            println("i = $i")
        }

        for(i in 6 until 10) {
            println("i = $i")
        }

        val person = Person("Kortrijk")
        person.name="Pol"
        person.age=20
        person.eat()

        val student = Student("Waregem","fase 2")
        student.name="Alice"
        student.age=18
        student.sno="S001"
        student.grade=90
        student.eat()
        println("Student ${student.name} is in ${student.fase} with sno ${student.sno} and grade ${student.grade}")

        Read(student)

    }
}