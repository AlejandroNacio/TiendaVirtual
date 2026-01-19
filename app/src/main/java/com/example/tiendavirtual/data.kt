package com.example.tiendavirtual

import androidx.annotation.DrawableRes

data class Product(
    val nombre: String,
    val precio: Double,
    @DrawableRes val imagen: Int,
    val descripcion: String
)

val listaProductos = listOf(
    Product("Zapatillas Nike", 40.99, R.drawable.zapatillas, "Zapatillas running nike para hacer deporte"),
    Product("Camiseta Málaga FC", 50.99, R.drawable.camiseta, "La nueva equipación de Málaga para ir a ver el partido"),
    Product("Gorra Málaga", 15.99, R.drawable.gorra, "Gorra para portegerte del sol")
)