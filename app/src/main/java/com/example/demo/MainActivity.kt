package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fuelDownload: TextView = findViewById(R.id.fuel_download_activity)
        fuelDownload.setOnClickListener {
            val intent = Intent(application, FuelDownloadActivity::class.java)
            startActivity(intent)
            // Finish　MainActivity
            finish()
        }
    }
}