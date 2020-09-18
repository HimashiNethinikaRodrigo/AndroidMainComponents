package com.example.android.androidmaincomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRoll.setOnClickListener { rollDice() }
        buttonCountUp.setOnClickListener { countUp() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "Roll Button Clicked", Toast.LENGTH_SHORT).show()
        textViewInfo.text = "Dice Rolled!"
        val randomInt = (1..6).random()
        textViewDice.text = randomInt.toString()
    }

    private fun countUp() {
        var text = textViewDice.text.toString().toIntOrNull()
        if (text != null) {
            if (text < 6)
                textViewDice.text = (++text).toString()
        } else
            textViewDice.text = "1"
    }

}