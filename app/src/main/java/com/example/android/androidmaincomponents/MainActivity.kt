package com.example.android.androidmaincomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var randomIntOne = 0
    private var randomIntTwo = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRoll.setOnClickListener { rollDice() }
        buttonCountUp.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        textViewInfo.text = getString(R.string.dice_roll_text)
        randomIntOne = (1..6).random()
        randomIntTwo = (1..6).random()
        imageViewDiceOne.setImageResource(getResource(randomIntOne))
        imageViewDiceTwo.setImageResource(getResource(randomIntTwo))
    }

    private fun countUp() {
        imageViewDiceOne.setImageResource(getResource(++randomIntOne))
        imageViewDiceTwo.setImageResource(getResource(++randomIntTwo))
    }

    private fun getResource(value: Int): Int {
        return when (value) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

}