package com.example.mariam_buttoncounterbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var counterButton: Button

    lateinit var tvCounter: TextView
    private var counter = 26
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCounter = findViewById(R.id.number)
        counterButton = findViewById(R.id.Btoon)

        tvCounter.text = "$counter"

        counterButton.setOnClickListener{
            tvCounter.text = "${++counter}"
        }
    }
}