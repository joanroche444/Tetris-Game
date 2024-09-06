package com.example.tetrisgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tetrissplash)

        val thread = Thread {
            try {
                Thread.sleep(5000)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                val mainIntent = Intent(this, MenuActivity::class.java)
                startActivity(mainIntent)
                finish()
            }
        }
        thread.start()
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}