package com.staker4wapper.mvc_todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNumber = findViewById<TextView>(R.id.tv_number)
        val btnIncrease = findViewById<Button>(R.id.btn_increase)

        val model = Model()

        btnIncrease.setOnClickListener {
            model.increaseNumber()
            tvNumber.text = model.getNumber().toString()
        }

    }
}