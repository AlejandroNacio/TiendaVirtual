package com.example.tiendavirtual.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon

@Composable
fun ConfirmacionScreen(onReturnHome: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = "Éxito",
            modifier = Modifier.size(100.dp),
            tint = Color.Blue
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "¡Compra realizada!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onReturnHome,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF536999)
            )
        ) {
            Text(text = "Volver a la Tienda", color = Color.White)
        }
    }
}