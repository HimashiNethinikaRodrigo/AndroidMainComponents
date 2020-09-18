package com.example.android.androidmaincomponents

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRoll.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        Toast.makeText(this, "Roll Button Clicked", Toast.LENGTH_SHORT).show()
    }
}