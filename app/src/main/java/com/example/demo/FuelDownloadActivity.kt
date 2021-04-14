package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FuelDownloadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fuel_download)
        val back: TextView = findViewById(R.id.back)
        back.setOnClickListener {
            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
            // Finish　FuelDownloadActivity
            finish()
        }
        val fuelDownloadText: TextView = findViewById(R.id.fuel_download_get_string)
        fuelDownloadText.text = FuelDownloader().download()
    }
}