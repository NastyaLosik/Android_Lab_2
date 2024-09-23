package com.example.toasthandler

import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_ok)
        button.setOnClickListener{
            Toast.makeText(this, "Кнопка ОК", Toast.LENGTH_SHORT).show()
        }

    }
}