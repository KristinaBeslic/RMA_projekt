package com.example.rma_projekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class ScannerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanner)

        val btnAddProductFromScannerActivity = findViewById<Button>(R.id.btnAddProductFromScannerActivity)
        btnAddProductFromScannerActivity.setOnClickListener {
            val intent = Intent(this, AddProducts::class.java)
            startActivity(intent)
        }

        val ivClose = findViewById<ImageView>(R.id.ivClose)
        ivClose.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}