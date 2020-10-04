package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val handler = Handler()
    private val runnable = Runnable {
        // Transition to MainActivity
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        // Finish　SplashActivity
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // Call runnable after 1000ms (1second) of SplashActivity display to transition to MainActivity
        handler.postDelayed(runnable, 1000)
    }

    override fun onStop() {
        super.onStop()
        // Prevent runnable from being called when the app is finishing during the SplashActivity display
        // Without this, it will be display again after erasing the app
        handler.removeCallbacks(runnable)
    }
}