package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        val buttonBlackText = findViewById<Button>(R.id.button_black_text)
        val buttonSize8 = findViewById<Button>(R.id.button_size8)
        val buttonWhiteBackground = findViewById<Button>(R.id.button_white_background)
        val buttonRedText = findViewById<Button>(R.id.button_red_text)
        val buttonSize24 = findViewById<Button>(R.id.button_size24)
        val buttonYellowBackground = findViewById<Button>(R.id.button_yellow_background)
        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }
        buttonSize8.setOnClickListener {
            editText.textSize = 8f
        }
        buttonWhiteBackground.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }
        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }
        buttonSize24.setOnClickListener {
            editText.textSize = 24f
        }
        buttonYellowBackground.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}