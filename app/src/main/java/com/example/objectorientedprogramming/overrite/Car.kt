package com.example.objectorientedprogramming.overrite

class Car : Vehicle() {

    fun superStart(){
        super.start()
    }

    fun superAccelerate() {
        super.accelerate(80)
    }

    fun superStop() {
        super.stop()
    }


    override fun start(){
        println("Vehicle has started")
    }

    override fun accelerate(speed:Int){
        println("Vehicle accelerates at $speed .")
    }

    override fun stop() {
        println("Vehicle has stopped.")
    }
}