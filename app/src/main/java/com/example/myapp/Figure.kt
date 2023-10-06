package com.example.myapp

data class Figure(var width: Double, var height: Double) {
    private var _area: Double = width * height
    var area: Double
        get() = _area
        set(value) {
            _area = value
        }
}
