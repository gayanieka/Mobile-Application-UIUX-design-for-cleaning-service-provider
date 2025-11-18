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

class DeepcleaningInfoActivity : AppCompatActivity() {


    private val BASE_PRICE = 1250.00

    private var personCount = 1

    private lateinit var personCountTextView: TextView
    private lateinit var totalPriceTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.deepcleaning_info)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val backButton: ImageButton = findViewById(R.id.imageButton)
        val plusButton: ImageButton = findViewById(R.id.plusButton)
        val minusButton: ImageButton = findViewById(R.id.minusButton)
        personCountTextView = findViewById(R.id.personCountTextView)
        totalPriceTextView = findViewById(R.id.totalPriceTextView)

        val addToCartButton = findViewById<Button>(R.id.addToCartButton)


        updatePrice()


        addToCartButton.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            val intent = Intent(this, CleaningHome1Activity::class.java)
            startActivity(intent)
        }

        plusButton.setOnClickListener {
            personCount++
            updatePrice()
        }

        minusButton.setOnClickListener {
            if (personCount > 1) {
                personCount--
                updatePrice()
            }
        }
    }


    private fun updatePrice() {

        personCountTextView.text = personCount.toString()


        val totalPrice = personCount * BASE_PRICE


        totalPriceTextView.text = String.format("Rs. %.2f", totalPrice)
    }
}