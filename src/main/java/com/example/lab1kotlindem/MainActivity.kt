package com.example.lab1kotlindem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn : Button
        var txt : TextView
        btn = findViewById(R.id.mybtn)
        txt = findViewById(R.id.mytxt)
        btn.setOnClickListener {
            txt.setText("Новый текст")
        }
    }
}