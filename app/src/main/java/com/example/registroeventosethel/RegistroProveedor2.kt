package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class RegistroProveedor2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_proveedor2)

        // Inicialización de vistas
        val btnRegresarRP2 = findViewById<Button>(R.id.btnRegresarRP2)
        val btnSiguienteRP2 = findViewById<Button>(R.id.btnSiguienteRP2)
        val spnTipoProvRP2 = findViewById<Spinner>(R.id.spnTipoProvRP2)
        val spnProvinciaRP2 = findViewById<Spinner>(R.id.spnProvinciaRP2)
        val spnDistritoRP2 = findViewById<Spinner>(R.id.spnDistritoRP2)

        // Adaptador para el spinner de tipo de proveedor
        val adapterTipoProveedor = ArrayAdapter.createFromResource(
            this,
            R.array.tipo_prov_opc,
            android.R.layout.simple_spinner_item
        ).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }
        spnTipoProvRP2.adapter = adapterTipoProveedor

        // Adaptador para el spinner de provincias
        val adapterProvincias = ArrayAdapter.createFromResource(
            this,
            R.array.provincia_opc,
            android.R.layout.simple_spinner_item
        ).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }
        spnProvinciaRP2.adapter = adapterProvincias

        // Adaptador para el spinner de distritos (inicialmente vacío)
        val adapterDistritos = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item)
        adapterDistritos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnDistritoRP2.adapter = adapterDistritos

        // Listener para el spinner de provincias
        spnProvinciaRP2.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Obtener la provincia seleccionada
                val provinciaSeleccionada = parent?.getItemAtPosition(position).toString()

                // Cargar los distritos correspondientes a la provincia seleccionada
                cargarDistritos(provinciaSeleccionada)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                adapterDistritos.clear()
                adapterDistritos.add("Seleccionar distrito")
                spnDistritoRP2.setSelection(0)
            }

            // Método para cargar los distritos según la provincia seleccionada
            private fun cargarDistritos(provincia: String) {
                val idArrayDistritos = when (provincia) {
                    "Barranca" -> R.array.dist_barranca_opc
                    "Cajatambo" -> R.array.dist_cajatambo_opc
                    "Canta" -> R.array.dist_canta_opc
                    "Cañete" -> R.array.dist_cañete_opc
                    "Huaral" -> R.array.dist_huaral_opc
                    "Huarochirí" -> R.array.dist_huarochiri_opc
                    "Huaura" -> R.array.dist_huaura_opc
                    "Lima provincia" -> R.array.dist_lima_opc
                    "Oyón" -> R.array.dist_oyon_opc
                    "Yauyos" -> R.array.dist_yauyos_opc
                    else -> 0
                }

                // Cargar los distritos desde los recursos
                if (idArrayDistritos != 0) {
                    val distritos = resources.getStringArray(idArrayDistritos)
                    adapterDistritos.clear()
                    adapterDistritos.add("Seleccionar distrito")
                    adapterDistritos.addAll(*distritos) // Usamos * para descomponer el array
                } else {
                    adapterDistritos.clear()
                    adapterDistritos.add("Seleccionar distrito")
                }
                spnDistritoRP2.setSelection(0)
            }
        })

        btnRegresarRP2.setOnClickListener{
            val siguiente = Intent(this, PantallaPrincipal::class.java)
            startActivity(siguiente)
        }
        btnSiguienteRP2.setOnClickListener{
            val siguiente = Intent(this, AgregarServicio::class.java)
            startActivity(siguiente)
        }
    }
}