package com.example.myapp

class Fish(name: String, age: Int) : Animal(name, age) {

    val maxDuration = 30
    override fun move(duration: Int): Boolean {
        return duration < -maxDuration
    }
}