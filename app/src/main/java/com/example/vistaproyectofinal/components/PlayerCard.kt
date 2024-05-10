package com.example.vistaproyectofinal.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vistaproyectofinal.R

import com.example.vistaproyectofinal.models.Player


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerCard(navController: NavHostController, player: Player, ) {

    Card(modifier = Modifier
        .padding(20.dp,10.dp,20.dp,10.dp),
        onClick = {
            navController.navigate("PlayerView" /*+
                    "/${player.player_name}" +
                    "/${player.num}" +
                    "/${player.AST}" +
                    "/${player.BLK}" +
                    "/${player.DRB}" +
                    "/${player.ORB}" +
                    "/${player.PF}" +
                    "/${player.AST}" +
                    "/${player.PTS}" +
                    "/${player.STL}" +
                    "/${player.TOV}" +
                    "/${player.TRB}" +
                    "/${player.age}" +
                    "/${player.field_goals}" +
                    "/${player.games}" +
                    "/${player.season}" +
                    "/${player.team}" +
                    "/${player.profilePic}"*/)
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color= Color.Black.copy(alpha = 0.8f)),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Spacer(modifier = Modifier.width(18.dp))

            Column (modifier = Modifier.padding(10.dp,20.dp,10.dp,20.dp)) {
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "${player.team}",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFE43A4E),
                        fontSize = 20.sp
                    )

                    Text(
                        text = "${player.player_name}",
                        color = Color(0xFFFFFFFF),
                        fontSize = 20.sp
                    )

                    Text(
                        text = "# ${player.num}",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFFFFF),
                        fontSize = 20.sp
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    PlayerCard(
        navController = rememberNavController(),
        player = Player("Daishen Nix", 20 , 57, "HOU", 2023,81, 18,80,98,132,31,7,86,59,226, R.drawable.jugador, 32)
    )
}