package com.example.intent_and_splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.intent5.R

class Baslangic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)

        Handler().postDelayed({
            val gec = Intent(applicationContext,MainActivity::class.java)
            startActivity(gec)
            finish()
        },3000)
    }
}