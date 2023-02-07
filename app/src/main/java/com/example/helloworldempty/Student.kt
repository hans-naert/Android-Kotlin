package com.example.helloworldempty

class Student(val sno: String, val grade: Int): Person(), Study {
    init {
        println("sno is " + sno)
        println("grade is " + grade)
    }
    //var sno=""
    //var grade=0
    override fun readBooks() {
        println(name + " is reading.")
    }
    override fun doHomework() {
        println(name + " is doing homework.")
    }
}