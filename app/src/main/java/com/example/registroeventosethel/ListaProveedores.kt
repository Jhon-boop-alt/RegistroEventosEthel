package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListaProveedores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_proveedores)

        val btnRegresarLP = findViewById<Button>(R.id.btnRegresarLP)

        btnRegresarLP.setOnClickListener {
            val siguiente = Intent(this, PantallaPrincipal::class.java)
            startActivity(siguiente)
        }
    }
}