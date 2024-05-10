package com.example.vistaproyectofinal.handlers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.vistaproyectofinal.R
import com.example.vistaproyectofinal.views.InicioSesion
import com.example.vistaproyectofinal.views.ListView
import com.example.vistaproyectofinal.views.MyToolbar
import com.example.vistaproyectofinal.views.PlayerView


@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "InicioSesion") {

        composable(route = "InicioSesion") {
            InicioSesion(navController)
        }

        composable(route = "EquiposView") {
            MyToolbar(navController)
        }


        //Definiendo Rutas
        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "PlayerView /{player_name} /{age} /{num} /{games} /{team} /{season} /{field_goals} /{ORB} /{DRB} /{TRB} /{AST} /{STL} /{BLK} /{TOV} /{PF} /{PTS} /{profilePic}",

            arguments =
            listOf(
                navArgument("player_name") {type = NavType.StringType},
                navArgument("age") {type = NavType.IntType},
                navArgument("num") {type = NavType.IntType},
                navArgument("games") {type = NavType.IntType},
                navArgument("team") {type = NavType.StringType},
                navArgument("season") {type = NavType.IntType},
                navArgument("field_goals") {type = NavType.IntType},
                navArgument("ORB") {type = NavType.IntType},
                navArgument("DRB") {type = NavType.IntType},
                navArgument("TRB") {type = NavType.IntType},
                navArgument("AST") {type = NavType.IntType},
                navArgument("STL") {type = NavType.IntType},
                navArgument("BLK") {type = NavType.IntType},
                navArgument("TOV") {type = NavType.IntType},
                navArgument("PF") {type = NavType.IntType},
                navArgument("PTS") {type = NavType.IntType},
                navArgument("profilePic") {type = NavType.IntType}


            )
        ) {
                parameters ->
            val player_name = parameters.arguments?.getString("player_name") ?: ""
            val age = parameters.arguments?.getInt("age") ?: 0
            val num = parameters.arguments?.getInt("num") ?: 0
            val games = parameters.arguments?.getInt("games") ?: 0
            val team = parameters.arguments?.getString("team") ?: ""
            val season = parameters.arguments?.getInt("season") ?: 0
            val field_goals = parameters.arguments?.getInt("field_goals") ?: 0
            val ORB = parameters.arguments?.getInt("ORB") ?: 0
            val DRB = parameters.arguments?.getInt("DRB") ?: 0
            val TRB = parameters.arguments?.getInt("TRB") ?: 0
            val AST = parameters.arguments?.getInt("AST") ?: 0
            val STL = parameters.arguments?.getInt("STL") ?: 0
            val BLK = parameters.arguments?.getInt("BLK") ?: 0
            val TOV = parameters.arguments?.getInt("TOV") ?: 0
            val PF = parameters.arguments?.getInt("PF") ?: 0
            val PTS = parameters.arguments?.getInt("PTS") ?: 0
            val profilePic = parameters.arguments?.getInt("profilePic") ?: 0

            PlayerView(
                navController,
                player_name,
                age,
                num,
                games,
                team,
                season,
                field_goals,
                ORB,
                DRB,
                TRB,
                AST,
                STL,
                BLK,
                TOV,
                PF,
                PTS,
                profilePic
            )
        }
    }
}