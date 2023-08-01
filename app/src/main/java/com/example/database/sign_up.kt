package com.example.database

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class sign_up : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val mybtn = findViewById<TextView>(R.id.to_login)
        mybtn.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var name = findViewById<TextView>(R.id.name)
        var email = findViewById<TextView>(R.id.email)
        var contact = findViewById<TextView>(R.id.contact)
        var password = findViewById<TextView>(R.id.password)
        var button = findViewById<Button>(R.id.btn_signup)
        button.setOnClickListener {

        }
    }
    }
