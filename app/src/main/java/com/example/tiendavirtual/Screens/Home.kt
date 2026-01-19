package com.example.tiendavirtual.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiendavirtual.Product
import com.example.tiendavirtual.listaProductos

@Composable
fun HomeScreen(onNavigate: (String) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            Text(
                text = "Catálogo disponible:",
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(start = 16.dp, top = 24.dp, end = 16.dp, bottom = 8.dp)
            )
        }
        items(listaProductos) { producto ->
            ProductCard(
                product = producto,
                onVerClick = { onNavigate(producto.nombre) }
            )
        }
    }
}
@Composable
fun ProductCard(product: Product, onVerClick: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = product.imagen),
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(product.nombre, fontWeight = FontWeight.Bold)
                Text("${product.precio} €")
            }
            Button(
                onClick = onVerClick,
                modifier = Modifier.padding(end = 16.dp)
            ) {
                Text("Ver")
            }
        }
    }
}