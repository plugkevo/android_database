package com.example.database

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

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

            var url:String= "http://192.168.100.191/android_class/add_student.php?name="+ name.text.toString() +email.text.toString() +contact.text.toString() +password.text.toString()

            var rgst:RequestQueue = Volley.newRequestQueue(this )

            val jos = JsonObjectRequest(Request.Method.GET,url,null, {
                    response -> Toast.makeText(this, "Record added successfully", Toast.LENGTH_LONG).show()}, { error-> })

            rgst.add(jos)
            }


        }
    }

