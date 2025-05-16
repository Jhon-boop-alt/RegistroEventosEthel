package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Calendario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario)

        val btnRegresarCalend = findViewById<Button>(R.id.btnRegresarCalend)
        val btnFiltrarFecha = findViewById<Button>(R.id.btnFiltrarFecha)
        val btnFiltrarUbi = findViewById<Button>(R.id.btnFiltrarUbi)
        val btnFiltrarTE = findViewById<Button>(R.id.btnFiltrarTE)

        btnRegresarCalend.setOnClickListener{
            val siguiente = Intent(this, PantallaPrincipal::class.java)
            startActivity(siguiente)
        }
        btnFiltrarUbi.setOnClickListener{
            val siguiente = Intent(this, CalendarioFiltrado1::class.java)
            startActivity(siguiente)
        }
        btnFiltrarFecha.setOnClickListener() {
            val siguiente = Intent(this, CalendarioFiltrado2::class.java)
            startActivity(siguiente)
        }
        btnFiltrarTE.setOnClickListener{
            val siguiente = Intent(this, CalendarioFiltrado3::class.java)
            startActivity(siguiente)
        }
    }
}