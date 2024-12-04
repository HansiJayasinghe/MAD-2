package com.example.hansiiiiii

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var textViewaa = findViewById<TextView>(R.id.textView12)
        textViewaa.setOnClickListener {
            val intent1 = Intent (this, signup::class.java)
            startActivity(intent1)
        }
        var buttonfour = findViewById<Button>(R.id.button4)
        buttonfour.setOnClickListener {
            val intent1 = Intent (this, homepagemain::class.java)
            startActivity(intent1)
        }
    }
}