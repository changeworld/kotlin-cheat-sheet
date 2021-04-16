package com.example.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.databinding.ActivityFuelDownloadBinding

class FuelDownloadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFuelDownloadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFuelDownloadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener {
            // Transition to MainActivity
            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
            // Finish FuelDownloadActivity
            finish()
        }
        binding.fuelDownloadGetString.text = FuelDownloader().download()
    }
}