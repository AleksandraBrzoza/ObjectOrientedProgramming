package com.example.objectorientedprogramming

fun main(args: Array<String>) {

    var myCar = Cars()
    myCar.name = "Feerari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar2.name = "Mercedes"
    myCar2.model = 2010

    println("My car's name is ${myCar.name} and it's model is ${myCar.model}")
    println("My second car's name is ${myCar2.name} and it's model is ${myCar2.model}")



}