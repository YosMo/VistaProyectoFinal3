package com.example.vistaproyectofinal.views

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vistaproyectofinal.R

@Composable
fun PlayerView(
    navController: NavHostController,
    player_name : String,
    age : Int,
    num : Int,
    games : Int,
    team : String,
    season : Int,
    field_goals : Int,
    ORB: Int,
    DRB: Int,
    TRB: Int,
    AST: Int,
    STL: Int,
    BLK: Int,
    TOV: Int,
    PF: Int,
    PTS: Int,
    profilePic : Int
) {
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
            colorFilter = ColorFilter.lighting(multiply = Color.DarkGray , add = Color.Transparent )

        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){

                Image(
                    painter = painterResource(id = profilePic),
                    contentDescription = "Member",
                    modifier = Modifier.size(200.dp)
                )

                Column(verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = team,
                        textAlign = TextAlign.Center,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = season.toString(),
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                    Text(
                        text = "# $num",
                        textAlign = TextAlign.Center,
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Red
                    )
                }

            }

            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = player_name,
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "$age años",
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
                Text(
                    text = "$games juegos",
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .background(Color(0xFF9C0303), shape = RoundedCornerShape(12.dp))
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(id = R.drawable.balon),
                    contentDescription = "Balon",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = field_goals.toString(),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Estadísticas",
                textAlign = TextAlign.Left,
                fontSize = 25.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(5.dp))

            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                /*modifier = Modifier.fillMaxHeight()*/
            ) {

                Row(modifier = Modifier
                    .padding(5.dp)) {

                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "ORB",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$ORB%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "DRB",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$DRB%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.width(15.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "TRB",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$TRB%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                }

                Row(modifier = Modifier
                    .padding(10.dp)
                ){

                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "AST",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$AST%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "STL",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$STL%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "BLK",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$BLK%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                }
                Row(modifier = Modifier
                    .padding(5.dp)) {

                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "TOV",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$TOV%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "PF",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$PF%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Column(
                        modifier = Modifier
                            .background(Color(0xFF700606), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Text(
                            text = "PTS",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$PTS%",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                }

            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(
                onClick = { navController.popBackStack() },
                colors = ButtonDefaults.buttonColors(Color(0xFFFFFFF)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 5.dp)
            ) {
                Text(
                    text = "Regresar",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),
                    fontSize = 20.sp
                )
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun Preview_Player() {
    PlayerView(
        navController = rememberNavController(),
        player_name = "Jalen Green",
        age = 20,
        num = 1,
        games = 76,
        team = "HOU",
        season = 2023,
        field_goals = 566,
        ORB = 43,
        DRB= 241,
        TRB= 284,
        AST= 281,
        STL= 59,
        BLK= 18,
        TOV= 200,
        PF= 131,
        PTS= 1683,
        profilePic= R.drawable.jugador
    )
}