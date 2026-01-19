package com.example.tiendavirtual.navegacion

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.tiendavirtual.Screens.ConfirmacionScreen
import com.example.tiendavirtual.Screens.HomeScreen
import com.example.tiendavirtual.Screens.DetalleProducto
import com.example.tiendavirtual.listaProductos

@Composable
fun GestionNavegacion() {
    val pilaNavegacion = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = pilaNavegacion,
        onBack = { pilaNavegacion.removeLastOrNull() },
        entryProvider = { key ->
            when (key) {
                is Routes.Home -> NavEntry(key) {
                    HomeScreen(onNavigate = { id ->
                        pilaNavegacion.add(Routes.DetalleProducto(id))
                    })
                }

                is Routes.DetalleProducto -> NavEntry(key) {
                    val producto = listaProductos.find { it.nombre == key.id }
                    if (producto != null) {
                        DetalleProducto(
                            product = producto,
                            onBack = { pilaNavegacion.removeLastOrNull() },
                            onComprarClick = {
                                pilaNavegacion.add(Routes.Confirmacion)
                            }
                        )
                    } else {
                        Text("Producto no encontrado")
                    }
                }

                is Routes.Confirmacion -> NavEntry(key) {
                    ConfirmacionScreen(onReturnHome = {
                        pilaNavegacion.clear()
                        pilaNavegacion.add(Routes.Home)
                    })
                }

                else -> NavEntry(key) {
                    Text("Página no encontrada")
                }
            }
        }
    )
}