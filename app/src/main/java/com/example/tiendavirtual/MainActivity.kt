package com.example.tiendavirtual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tiendavirtual.Screens.HomeScreen
import com.example.tiendavirtual.navegacion.GestionNavegacion
import com.example.tiendavirtual.ui.theme.TiendaVirtualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TiendaVirtualTheme {
                GestionNavegacion()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    TiendaVirtualTheme {
        HomeScreen(onNavigate = {})
    }
}