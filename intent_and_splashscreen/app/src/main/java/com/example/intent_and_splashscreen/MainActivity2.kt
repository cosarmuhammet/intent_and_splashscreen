package com.example.intent_and_splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.intent5.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var gecis2 = findViewById<Button>(R.id.button)
        var gelen = intent.getStringExtra("isim")
        var yazi2 = findViewById<TextView>(R.id.textView2)

        yazi2.text = gelen
        gecis2.setOnClickListener {
            val gec2 = Intent(applicationContext,MainActivity::class.java)
            gec2.putExtra("isim",yazi2.text.toString())

            startActivity(gec2)
        }

    }
}