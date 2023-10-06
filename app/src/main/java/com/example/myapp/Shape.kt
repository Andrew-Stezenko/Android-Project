package com.example.myapp

sealed class Shape {
    class Rectangle(val figure: Figure) : Shape()
    class Oval(val figure: Figure) : Shape()
    class Line(val length: Double) : Shape()
}
