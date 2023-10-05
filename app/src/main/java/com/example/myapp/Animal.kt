package com.example.myapp

abstract class Animal(val name: String, age: Int) {
    abstract fun move(duration: Int): Boolean
}