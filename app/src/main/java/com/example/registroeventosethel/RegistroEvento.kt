package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegistroEvento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_evento)

        val btnRegresarRE = findViewById<Button>(R.id.btnRegresarRE)
        val btnSiguienteRE = findViewById<Button>(R.id.btnSiguienteRE)

        btnRegresarRE.setOnClickListener{
            val siguiente = Intent(this, PantallaPrincipal::class.java)
            startActivity(siguiente)
        }
        btnSiguienteRE.setOnClickListener{
            val siguiente = Intent(this, ServicioEvento::class.java)
            startActivity(siguiente)
        }
    }
}