package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AgregarServicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_servicio)

        val btnRegresarSP = findViewById<Button>(R.id.btnRegresarSP)
        val btnRegistrarSP = findViewById<Button>(R.id.btnRegistrarSP)

        btnRegresarSP.setOnClickListener{
            val siguiente = Intent(this, RegistroProveedor2::class.java)
            startActivity(siguiente)
        }
        btnRegistrarSP.setOnClickListener{
            val siguiente = Intent(this, PantallaPrincipal::class.java)
            startActivity(siguiente)
        }
    }
}