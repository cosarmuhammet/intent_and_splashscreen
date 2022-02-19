package com.example.intent_and_splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.intent5.R
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gecis = findViewById<Button>(R.id.gecis)
        var yazi = findViewById<EditText>(R.id.yazi)

        gecis.setOnClickListener {
            val gec = Intent(applicationContext,MainActivity2::class.java)
            gec.putExtra("isim",yazi.text.toString())
            startActivity(gec)
        }

    }
}