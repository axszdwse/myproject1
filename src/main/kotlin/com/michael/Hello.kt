package com.michael

fun main(args: Array<String>) {
    //println("Hello KT")
    //Human().hello()
    val h=Human()
    h.hello()
    val age=19 //變數型態的自動推斷 val不可變 var可變
    var weight=66.5
    var name:String
    name = "Michael"
}

class Human{
    fun hello(){
        println("Hello KT")
    }
}