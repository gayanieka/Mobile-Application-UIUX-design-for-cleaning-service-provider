package com.example.dailyzen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignuppageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.signuppage)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val signupButton = findViewById<Button>(R.id.buttonSignup)


        signupButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

            finish()
        }


        val goToLoginTextView = findViewById<TextView>(R.id.textViewLogin)


        goToLoginTextView.setOnClickListener {

            val intent = Intent(this, LoginpageActivity::class.java)
            startActivity(intent)

            finish()
        }
    }
}