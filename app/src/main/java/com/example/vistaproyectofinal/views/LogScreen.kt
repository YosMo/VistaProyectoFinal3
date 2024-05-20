package com.example.vistaproyectofinal.views

import android.util.Patterns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vistaproyectofinal.R

@ExperimentalMaterial3Api
@Composable
fun LogScreen(navController: NavHostController){
    //Declaración de variables
    /*val context = LocalContext.current*/

    var name by remember {mutableStateOf("")}
    var email by remember { mutableStateOf("") }
    var isValidEmail by remember { mutableStateOf(false) }

    var contrasena by remember { mutableStateOf("") }
    var isValidPassword by remember { mutableStateOf(false) }

    var passwordVisible by remember { mutableStateOf(false) }


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
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.lighting(multiply = Color.LightGray, add = Color.Transparent)
        )
    }

    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        //Aqui va lo que irá dentro de la columna

        Column(
            Modifier
                .padding(30.dp)
                .background(Color.Black, shape = RoundedCornerShape(15.dp))
        ) {
            RowImage()
            /*RowName(name = name,
                onNameChange = {name = it})*/

            RowEmail(
                email = email,
                emailChange = {
                    email = it
                    isValidEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
                },
                isValidEmail
            )
            RowPassword(
                contrasena = contrasena,
                passwordChange = {
                    contrasena = it
                    isValidPassword = contrasena.length >= 6
                },
                passwordVisible = passwordVisible,
                passwordVisibleChange = { passwordVisible = !passwordVisible },
                isValidPassword = isValidPassword
            )
            /*RowButtonLogin(
                /*context = context,*/
                navController = rememberNavController(),
                isValidEmail = isValidEmail,
                isValidPassword = isValidPassword
            )*/
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center) {

                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    onClick = { navController.navigate("EquiposView") },
                    enabled = isValidEmail && isValidPassword,
                    colors = ButtonColors(containerColor = Color.Black, contentColor = Color.White, disabledContentColor = Color.Gray, disabledContainerColor = Color.Gray)
                ) {
                    Text(
                        stringResource(id = R.string.ingresar),
                        color = Color.White,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp)
                }

            }



        }
    }
}


/*@Composable
fun RowButtonLogin(
    /*context: Context,*/
    navController: NavHostController,
    isValidEmail: Boolean,
    isValidPassword: Boolean
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*login(context)*/  navController.navigate("EquiposView")},
            enabled = isValidEmail && isValidPassword
        ) {
            Text(text = "Inciar Sesión", color = Color.White)
        }
    }
}*/

/*fun login(context: Context) {
    Toast.makeText(context, "FAKE LOGIN :)", Toast.LENGTH_LONG).show()
}*/

@ExperimentalMaterial3Api
@Composable
fun RowPassword(
    contrasena: String,
    passwordChange: (String)->Unit,
    passwordVisible: Boolean,
    passwordVisibleChange: ()->Unit,
    isValidPassword: Boolean
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            Text(
                text = stringResource(R.string.password),
                fontSize = 20.sp,
                color = Color(0xFFFFFFFF)
            )

            OutlinedTextField(
                value = contrasena,
                onValueChange = passwordChange,
                maxLines = 1,
                singleLine = true,
                label = { Text(text = "", color = Color.Gray) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    val image = if(passwordVisible) {
                        Icons.Filled.VisibilityOff
                    } else {
                        Icons.Filled.Visibility
                    }
                    IconButton(
                        onClick = passwordVisibleChange
                    ) {
                        Icon(
                            modifier = Modifier.background(Color.Black),
                            imageVector = image,
                            contentDescription = "Ver contraseña")
                    }
                },
                visualTransformation = if(passwordVisible) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                colors = if(isValidPassword) {
                    TextFieldDefaults.outlinedTextFieldColors(
                        focusedLabelColor = Color.Green,
                        focusedBorderColor = Color.Green,
                        focusedTextColor = Color.Gray

                    )
                } else {
                    TextFieldDefaults.outlinedTextFieldColors(
                        focusedLabelColor = Color.Red,
                        focusedBorderColor = Color.Red,
                        focusedTextColor = Color.Gray
                    )
                }

            )
        }


    }
}

@ExperimentalMaterial3Api
@Composable
fun RowEmail(
    email: String,
    emailChange: (String)->Unit,
    isValid: Boolean
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(
                text = stringResource(R.string.login),
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFFFFFFFF)
            )
            Spacer(modifier = Modifier.height(25.dp))

            Text(
                text = stringResource(R.string.email),
                fontSize = 20.sp,
                color = Color(0xFFFFFFFF)
            )

            OutlinedTextField(
                value = email,
                onValueChange = emailChange,
                label = { Text(text = "", color = Color.Gray) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                maxLines = 1,
                singleLine = true,
                colors = if(isValid) {
                    TextFieldDefaults.outlinedTextFieldColors(
                        focusedLabelColor = Color.Green,
                        focusedBorderColor = Color.Green,
                        focusedTextColor = Color.Gray
                    )
                } else {
                    TextFieldDefaults.outlinedTextFieldColors(
                        focusedLabelColor = Color.Red,
                        focusedBorderColor = Color.Red,
                        focusedTextColor = Color.Gray
                    )
                }
            )
        }

    }
}

@Composable
fun RowName(
    name: String,
    onNameChange: (String) -> Unit
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {

            OutlinedTextField(
                value = name,
                onValueChange = onNameChange,
                label = { Text(text = "Name", color = Color.Black) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                maxLines = 1,
                singleLine = true,
            )



    }
}

@Composable
fun RowImage() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center) {
        Image(
            modifier = Modifier
                .width(200.dp)
                .background(Color.Black, shape = RoundedCornerShape(100.dp))
                .padding(5.dp)
                .size(200.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Imagen login")
    }
}


@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun Preview() {
    LogScreen(navController = rememberNavController())
}