package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

        val a2 = Bird("Кеша", 1, "Сірий")
        val a1 = Dog("Джек", 5, "Вівчарка")

        val v1 = myOuterFun(4, ::myInnerFun)
        val v2 = myOuterFun(3) {

            return@myOuterFun "12345"
        }


        val user = UserModel(
            name = "Rex",
            email = "123@gmail.com",
            age = 23
        )

        //Створення списку із дата класів Figure
        val figures = listOf(
            Figure(10.0, 4.0),
            Figure(2.0, 12.0),
            Figure(5.0, 7.0),
            Figure(3.0, 9.0)
        )

        //Загальна сума полів area
        var totalArea = 0.0
        for (figure in figures) {
            totalArea += figure.area
        }

        //Список з екземплярів класів Shape
        val shapes = listOf(
            Shape.Rectangle(Figure(15.0, 10.0)),
            Shape.Rectangle(Figure(9.0, 4.0)),
            Shape.Oval(Figure(4.0, 3.0)),
            Shape.Oval(Figure(12.0, 10.0)),
            Shape.Line(4.0)
        )

        //Рахуємо кількусть кожного типу Shape за допомогою фільтрації списку
        val rectangle2 = shapes.filterIsInstance<Shape.Rectangle>().size
        val oval2 = shapes.filterIsInstance<Shape.Oval>().size
        val line2 = shapes.filterIsInstance<Shape.Line>().size

        //Рахуємо кількість кожного типу Shape з використанням when в циклі списку
        var rectangle3 = 0
        var oval3 = 0
        var line3 = 0

        for (shape in shapes) {
            when (shape) {
                is Shape.Rectangle -> rectangle3++
                is Shape.Oval -> oval3++
                is Shape.Line -> line3++
            }
        }


    }

    fun myOuterFun(number: Int, innerFun: (myString: String) -> String): Int {
        val call = innerFun("123")
        return number * number
    }

    fun myInnerFun(myString: String): String {
        return "321"
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppTheme {
        Greeting("Android")
    }
}