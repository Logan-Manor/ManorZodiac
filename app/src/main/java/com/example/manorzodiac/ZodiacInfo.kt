package com.example.manorzodiac

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.zodiac1.R

class ZodiacInfo : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zodiac_info)

        val name = intent.getStringExtra("zodiac_name")
        val description = intent.getStringExtra("zodiac_description")
        val symbol = intent.getStringExtra("zodiac_symbol")
        val month = intent.getStringExtra("zodiac_month")

        findViewById<TextView>(R.id.zodiac_name).text = (name)
        findViewById<TextView>(R.id.zodiac_desc).text = description
        findViewById<TextView>(R.id.zodiac_month).text = (month)
        findViewById<TextView>(R.id.zodiac_symbol).text = (symbol)


    }
}