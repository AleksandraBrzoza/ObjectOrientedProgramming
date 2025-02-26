package com.example.objectorientedprogramming.overrite

import kotlinx.coroutines.processNextEventInCurrentThread

open class Vehicle {

    open fun start(){
        println("Car has started")
    }

    open fun accelerate(speed:Int){
        println("Car accelerates at $speed .")
    }

    open fun stop() {
        println("Car has stopped.")
    }

}