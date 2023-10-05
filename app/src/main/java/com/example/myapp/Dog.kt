package com.example.myapp

class Dog(name: String, age: Int, private var breed: String) : Animal(name, age), Voice {

    val maxDuration = 30
    override fun move(duration: Int): Boolean {
        return duration < -maxDuration
    }

    override fun loudVoice() {
    }

    override fun quietVoice() {
    }
}