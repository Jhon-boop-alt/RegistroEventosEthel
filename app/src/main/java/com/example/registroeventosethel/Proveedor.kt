package com.example.registroeventosethel

import java.io.Serializable

class Proveedor(private var codigo: Int = 0, private var tipoProveedor: String = "", private var nombre: String = "",
                private var direccion: String = "", private var provincia: String = "", private var distrito: String = "",
                private var celular: String = "", private var correoElectronico: String = ""): Serializable
{
    var Codigo: Int
        set(value) { codigo = value }
        get() { return codigo }

    var TipoProveedor: String
        set(value) { tipoProveedor = value }
        get() { return tipoProveedor }

    var Nombre: String
        set(value) { nombre = value }
        get() { return nombre }

    var Direccion: String
        set(value) { direccion = value }
        get() { return direccion }

    var Provincia: String
        set(value) { provincia = value }
        get() { return provincia }

    var Distrito: String
        set(value) { distrito = value }
        get() { return distrito }

    var Celular: String
        set(value) { celular = value }
        get() { return celular }

    var CorreoElectronico: String
        set(value) { correoElectronico = value }
        get() { return correoElectronico }
}