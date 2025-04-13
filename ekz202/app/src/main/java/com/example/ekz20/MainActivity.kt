package com.example.ekz20

import android.os.Bundle
import android.renderscript.Int2
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Int1 = findViewById<EditText>(R.id.number1)
        val Int2 = findViewById<EditText>(R.id.number2)
        val but = findViewById<Button>(R.id.calculateButton)
        val sum = findViewById<TextView>(R.id.resultText)

        but.setOnClickListener{
            val num1 = Int1.text.toString().toInt()
            val num2 = Int2.text.toString().toInt()


            val result = num1 + num2

            sum.text = "результат $result"

        }
    }
}