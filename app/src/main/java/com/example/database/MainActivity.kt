package com.example.database

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybtn = findViewById<TextView>(R.id.to_signup2)
        mybtn.setOnClickListener {
            val intent=Intent(this, sign_up::class.java)
            startActivity(intent)
        }
    }
}