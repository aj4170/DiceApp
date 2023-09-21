package com.example.day1android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import day1.Dice

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            diceRoll()
            rollButton.text="rolled"
            Snackbar.make(rollButton,"Dice Rolled!", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun diceRoll() {
        val dice = Dice(6)
        val diceRoll = dice.roll(6)
        val resultTextView: TextView = findViewById(R.id.textView5)
        resultTextView.text = diceRoll.toString()

        val diceImage: ImageView = findViewById(R.id.imageView2)
        diceImage.setImageResource(R.drawable.dice_2)

        val imageView2 = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(imageView2)

    }
}