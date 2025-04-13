package com.example.simplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим элементы интерфейса
        val editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        // Обработка нажатия на кнопку
        buttonCalculate.setOnClickListener {
            // Получаем значения из полей ввода и преобразуем их в числа
            val number1 = editTextNumber1.text.toString().toDouble()
            val number2 = editTextNumber2.text.toString().toDouble()

            // Выполняем сложение
            val result = number1 + number2

            // Отображаем результат
            textViewResult.text = "Результат: $result"
        }
    }
}