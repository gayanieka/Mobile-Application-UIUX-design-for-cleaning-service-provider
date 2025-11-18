package com.example.fixtidy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fixtidy.R

class RepairingHome1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.repairing_home1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val backButton = findViewById<ImageButton>(R.id.imageButtonBack)
        backButton.setOnClickListener {
            finish()
        }


        val titleTextView = findViewById<TextView>(R.id.textViewTitle)
        titleTextView.text = "Repair Service"


        val buttonInside = findViewById<Button>(R.id.buttonInside)
        val buttonOutside = findViewById<Button>(R.id.buttonOutside)

        buttonInside.setOnClickListener {

        }

        buttonOutside.setOnClickListener {
            val intent = Intent(this, RepairHome2Activity::class.java)
            startActivity(intent)
        }


    }
}