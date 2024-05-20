package com.example.vistaproyectofinal.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vistaproyectofinal.R
import androidx.navigation.compose.rememberNavController
import com.example.vistaproyectofinal.handlers.NavManager
import com.example.vistaproyectofinal.viewmodels.QuoteViewModel

@Composable fun MyToolbar(navController: NavHostController){
    Scaffold(
        topBar = { MyTopAppBar(navController) },) {
        EquiposView2(paddingValues = it, navController, QuoteViewModel())
    } }
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(navController: NavHostController){


    TopAppBar( title = {
        Text(
            text = "League XPERTS",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            color = Color.White)},
        colors = TopAppBarDefaults.smallTopAppBarColors( containerColor = Color(0x4DFFFFFF), titleContentColor = Color.White ),

        navigationIcon = {
            IconButton(onClick = { navController.popBackStack()}) {
                Icon(imageVector = Icons.Default.Home,
                    modifier = Modifier.size(50.dp),
                    contentDescription = "icono",
                    tint = Color(0xFF5C0000)
                ) } } )
}


@Composable
fun EquiposView2(paddingValues: PaddingValues, navController: NavHostController, quoteViewModel: QuoteViewModel = QuoteViewModel()) {
    var quote = quoteViewModel.quoteString

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = "Fondo General",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.lighting(multiply = Color.DarkGray, add = Color.Transparent)

        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {



            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp)
                    .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column() {
                    Column( modifier = Modifier
                        .background(Color(0x90F30506), shape = RoundedCornerShape(15.dp))
                        .padding(5.dp)

                    ) {Text(
                        text = stringResource(id = R.string.frase_dia),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    }

                    Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = quote,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )

                }

                Spacer(modifier = Modifier.width(30.dp))

                Column( modifier = Modifier
                    .background(Color(0x0FF50505), shape = RoundedCornerShape(15.dp))
                    .padding(5.dp)

                ) {
                    Text(
                        text = stringResource(id = R.string.equipos),
                        textAlign = TextAlign.Center,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }


                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(45.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .background(Color(0xFFFFFFF), shape = RoundedCornerShape(12.dp))
                            .padding(20.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.e4),
                            contentDescription = "pp",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(50.dp)
                                .clickable { navController.navigate("ListView") }

                        )

                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .background(Color(0xFFFFFFF), shape = RoundedCornerShape(12.dp))
                            .padding(20.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.e9),
                            contentDescription = "pp",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(50.dp)
                        )
                    }
                }
            }
        }
    }
}