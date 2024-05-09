package com.example.vistaproyectofinal.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vistaproyectofinal.R

@Preview(showBackground = true)
@Composable
fun InicioSesion(){
    Sesion()
}

@Composable
fun Sesion() {

    //Variables
    var correo: String by remember { mutableStateOf("") }
    var contraseña: String by remember { mutableStateOf("") }

    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center){
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = "Fondo General",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds

        )
    }

    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription ="logo",
            modifier = Modifier.size(170.dp))

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Iniciar Sesión",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color(0xFFFFFFFF)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Correo",
            fontSize = 20.sp,
            color = Color(0xFFFFFFFF)
        )

        OutlinedTextField(
            value = correo,
            onValueChange = {correo = it.toString()},
            label = { Text("Correo") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),

            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Contraseña",
            fontSize = 20.sp,
            color = Color(0xFFFFFFFF)

        )
        
        OutlinedTextField(
            value = contraseña,
            onValueChange = {contraseña = it.toString()},
            label = { Text("Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),


            )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF110F13)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        ) {
            Text(
                text = "Ingresar",
                color = Color(0xFFFFFFFF),
                fontSize = 16.sp
            )


        }

        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "¿No tienes cuenta? Registrate",
            fontSize = 15.sp,
            color = Color(0xFFFFFFFF)
        )


    }
}