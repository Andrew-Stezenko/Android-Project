package com.example.myapp

class Bird(name: String, age: Int, private var color: String) : Animal(name, age), Flyable, Voice {
    val maxFlyDuration = 20
    val maxDuration = 30
    override fun move(duration: Int): Boolean {
        return duration < -maxDuration
    }

    override fun fly(duration: Int): Boolean {
        return duration < -maxFlyDuration
    }

    override fun loudVoice() {
    }

    override fun quietVoice() {
    }
}