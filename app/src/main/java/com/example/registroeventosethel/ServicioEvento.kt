package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ServicioEvento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicio_evento)

        val btnRegresarSE = findViewById<Button>(R.id.btnRegresarSE)
        val btnRegistrarSE = findViewById<Button>(R.id.btnRegistrarSE)

        btnRegresarSE.setOnClickListener{
            val siguiente = Intent(this, RegistroEvento::class.java)
            startActivity(siguiente)
        }
        btnRegistrarSE.setOnClickListener{
            val siguiente = Intent(this, PantallaPrincipal::class.java)
            startActivity(siguiente)
        }
    }
}