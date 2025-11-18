package com.example.fixtidy

import android.content.Intent

import android.os.Bundle

import android.widget.Button

import android.widget.ImageButton

import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.ViewCompat

import androidx.core.view.WindowInsetsCompat



class CleaningHome1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.cleaning_home1)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->

            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            insets

        }





        val outsideButton: Button = findViewById<Button>(R.id.buttonOutside)





        outsideButton.setOnClickListener {



            val intent = Intent(this, CleaningHome2Activity::class.java)

            startActivity(intent)

        }





        val backButton: ImageButton = findViewById(R.id.imageButtonBack)





        backButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)

            startActivity(intent)

        }





        val deepCleaningButton: Button = findViewById <Button> (R.id.buttonDeepCleaning)





        deepCleaningButton.setOnClickListener {



            val intent = Intent(this, DeepcleaningInfoActivity::class.java)

            startActivity(intent)

        }

    }

}