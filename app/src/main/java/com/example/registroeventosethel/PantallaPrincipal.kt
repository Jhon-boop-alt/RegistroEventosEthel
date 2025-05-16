package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PantallaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_prinicipal)

        val imbRegProvPP = findViewById<ImageButton>(R.id.imbRegProvPP)
        val imbRegEventPP = findViewById<ImageButton>(R.id.imbRegEventPP)
        val imbListProvPP = findViewById<ImageButton>(R.id.imbListProvPP)
        val imbListEventPP = findViewById<ImageButton>(R.id.imbListEventPP)
        val imbCalendarioPP = findViewById<ImageButton>(R.id.imbCalendarioPP)

        imbRegProvPP.setOnClickListener{
            val siguiente = Intent(this, RegistroProveedor2::class.java)
            startActivity(siguiente)
        }
        imbRegEventPP.setOnClickListener{
            val siguiente = Intent(this, RegistroEvento::class.java)
            startActivity(siguiente)
        }
        imbListProvPP.setOnClickListener{
            val siguiente = Intent(this, ListaProveedores::class.java)
            startActivity(siguiente)
        }
        imbListEventPP.setOnClickListener{
            val siguiente = Intent(this, ListaEventos::class.java)
            startActivity(siguiente)
        }
        imbCalendarioPP.setOnClickListener{
            val siguiente = Intent(this, Calendario::class.java)
            startActivity(siguiente)
        }
    }
}