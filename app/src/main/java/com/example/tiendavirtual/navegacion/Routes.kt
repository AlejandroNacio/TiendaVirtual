package com.example.tiendavirtual.navegacion

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Routes : NavKey {

    @Serializable
    data object Home : Routes

    @Serializable
    data class DetalleProducto(val id: String) : Routes

    @Serializable
    data object Confirmacion : Routes

    @Serializable
    data object  Error : Routes

}