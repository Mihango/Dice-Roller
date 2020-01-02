package com.example.diceroller

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup() {
        roll_button.text = getString(R.string.let_roll)
    }

    // display toast
//    fun rollDice(view: View) {
//        Toast.makeText(this, "Rolling Dice", Toast.LENGTH_SHORT).show()
//        text_result.text = getString(R.string.result, 2)
//    }

    fun rollDice(view: View) {
        // not good for testing -- cant tell what is random no.
        val randomInt = Random().nextInt(6) + 1
        text_result.text = getString(R.string.result, randomInt)

        val drawable = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice_image.setImageResource(drawable)
    }
}
