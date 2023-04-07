package com.example.prac9

import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var textSize: Float = 15F
    private lateinit var text2:TextView
    private lateinit var buttonClick: Button
    private lateinit var buttonClick1: Button
    private var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text2 = findViewById(R.id.text2)
        buttonClick = findViewById(R.id.button_plus)
        buttonClick1 = findViewById(R.id.button_minus)

        buttonClick.setOnClickListener {
            count++
            textSize = 15 + count.toFloat()
            text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize)
        }

        buttonClick1.setOnClickListener {
            count /= 2
            textSize = 15 + count.toFloat()
            text2.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize)
        }
    }

}