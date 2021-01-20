package com.appclr8.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.appclr8.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                rollDice()
            }
        })
    }

    private fun rollDice() {
        when (Random().nextInt(6) + 1){
            1 -> binding.imageView.setImageResource(R.drawable.dice_1)
            2 -> binding.imageView.setImageResource(R.drawable.dice_2)
            3 -> binding.imageView.setImageResource(R.drawable.dice_3)
            4 -> binding.imageView.setImageResource(R.drawable.dice_4)
            5 -> binding.imageView.setImageResource(R.drawable.dice_5)
            6 -> binding.imageView.setImageResource(R.drawable.dice_6)
        }
    }

}