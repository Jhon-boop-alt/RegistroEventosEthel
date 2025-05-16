package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalendarioFiltrado3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario_filtrado3)

        val btnRegresarEF3 = findViewById<Button>(R.id.btnRegresarEF3)

        btnRegresarEF3.setOnClickListener{
            val siguiente = Intent(this, Calendario::class.java)
            startActivity(siguiente)
        }
    }
}