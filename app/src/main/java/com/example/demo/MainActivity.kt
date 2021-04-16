package com.example.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fuelDownloadActivity.setOnClickListener {
            // Transition to FuelDownloadActivity
            val intent = Intent(application, FuelDownloadActivity::class.java)
            startActivity(intent)
            // Finish MainActivity
            finish()
        }
    }
}