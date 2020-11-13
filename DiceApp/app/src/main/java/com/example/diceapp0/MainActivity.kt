package com.example.diceapp0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn: Button = findViewById(R.id.rollBtn)
        rollBtn.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val resultText = Random().nextInt(6)+1
        val resultTv:TextView = findViewById(R.id.resultTV)
        resultTv.text = resultText.toString()
    }

}