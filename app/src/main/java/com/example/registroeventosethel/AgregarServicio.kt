package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgregarServicio : AppCompatActivity() {
    private lateinit var dbHelper: SqliteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_servicio)

        dbHelper = SqliteHelper(this)

        val proveedorId = intent.getLongExtra("proveedorId", -1)

        val etCodigo = findViewById<EditText>(R.id.txnCodigoSP)
        val etNombre = findViewById<EditText>(R.id.txtNombreSP)
        val etTipo = findViewById<EditText>(R.id.txtTipoSP)
        val etCosto = findViewById<EditText>(R.id.txnCostoSP)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrarSP)
        val btnRegresar = findViewById<Button>(R.id.btnRegresarSP)

        // Generar código automáticamente y bloquear edición
        etCodigo.setText(dbHelper.generarCodigoServicio())
        etCodigo.isEnabled = false

        btnRegistrar.setOnClickListener {
            val codigo = etCodigo.text.toString()
            val nombre = etNombre.text.toString()
            val tipo = etTipo.text.toString()
            val costo = etCosto.text.toString().toDoubleOrNull() ?: 0.0

            if (proveedorId != -1L && nombre.isNotBlank() && tipo.isNotBlank()) {
                val exito = dbHelper.registrarServicio(
                    idProveedor = proveedorId,
                    codigo = codigo,
                    nombre = nombre,
                    tipo = tipo,
                    costo = costo
                )

                if (exito) {
                    Toast.makeText(this, "Servicio registrado correctamente", Toast.LENGTH_SHORT).show()
                    finish() // o volver a ListaProveedores si deseas
                } else {
                    Toast.makeText(this, "Error al registrar servicio", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
