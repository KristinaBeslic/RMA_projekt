package com.example.rma_projekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class AddProducts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_products)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val etQuantity = findViewById<EditText>(R.id.etQuantity)

        val ivIncreaseQuantity = findViewById<ImageView>(R.id.ivIncreaseQuantity)
        ivIncreaseQuantity.setOnClickListener{
            etQuantity.setText((Integer.parseInt(etQuantity.getText().toString())+ 1).toString())
        }

        val ivDecreaseQuantity = findViewById<ImageView>(R.id.ivDecreaseQuantity)
        ivDecreaseQuantity.setOnClickListener {
            if(Integer.parseInt(etQuantity.text.toString()) > 1)
                etQuantity.setText((Integer.parseInt(etQuantity.getText().toString()) - 1).toString())
            else
                Toast.makeText(this, "Quantity cannot be less than 1", Toast.LENGTH_SHORT).show()

        }
    }
}