package com.example.registroeventosethel

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListaProveedores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_proveedores)

        val db = SqliteHelper(this)
        val proveedores = db.obtenerProveedores()
        val btnRegresarLP = findViewById<Button>(R.id.btnRegresarLP)
        val gridView = findViewById<GridView>(R.id.gridViewProveedores)

        val adapter = object : BaseAdapter() {
            override fun getCount() = proveedores.size
            override fun getItem(position: Int) = proveedores[position]
            override fun getItemId(position: Int) = proveedores[position].id
            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val view = convertView ?: layoutInflater.inflate(android.R.layout.simple_list_item_2, parent, false)
                val p = proveedores[position]

                view.findViewById<TextView>(android.R.id.text1).text = "${p.nombre} - ${p.tipo}"
                view.findViewById<TextView>(android.R.id.text2).text = "S/ ${p.precio} | ${p.telefono} | ${p.distrito}"

                view.setOnClickListener {
                    val intent = Intent(this@ListaProveedores, EditarProveedor::class.java)
                    intent.putExtra("proveedor", p) // Proveedor implementa Serializable
                    startActivity(intent)
                }

                return view
            }
        }

        gridView.adapter = adapter

        btnRegresarLP.setOnClickListener {
            startActivity(Intent(this, PantallaPrincipal::class.java))
        }
    }
}
