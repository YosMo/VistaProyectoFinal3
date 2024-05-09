package com.example.vistaproyectofinal.handlers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.vistaproyectofinal.views.ListView
import com.example.vistaproyectofinal.views.PlayerView


@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListView") {

        //Definiendo Rutas
        composable(route = "ListView") {
            ListView(navController)
        }

        composable(route = "PlayerView" +
                "/{message}" +
                "/{id}" +
                "/{name}" +
                "/{mail}" +
                "/{semester}" +
                "/{career}" +
                "/{hasScolarship}" +
                "/{gpa}" +
                "/{soldTickets}" +
                "/{profilePic}",

            arguments =
            listOf(
                navArgument("message") {type = NavType.StringType},
                navArgument("id") {type = NavType.IntType},
                navArgument("name") {type = NavType.StringType},
                navArgument("mail") {type = NavType.StringType},
                navArgument("semester") {type = NavType.IntType},
                navArgument("career") {type = NavType.StringType},
                navArgument("hasScolarship") {type = NavType.BoolType},
                navArgument("gpa") {type = NavType.FloatType},
                navArgument("soldTickets") {type = NavType.IntType},
                navArgument("profilePic") {type = NavType.IntType}
            )
        ) {
                parameters ->
            val message = parameters.arguments?.getString("message") ?: ""
            val id = parameters.arguments?.getInt("id") ?: 0
            val name = parameters.arguments?.getString("name") ?: ""
            val mail = parameters.arguments?.getString("mail") ?: ""
            val semester = parameters.arguments?.getInt("semester") ?: 0
            val career = parameters.arguments?.getString("career") ?: ""
            val hasScolarship = parameters.arguments?.getBoolean("hasScolarship") ?: false
            val gpa = parameters.arguments?.getFloat("gpa") ?: 0.0
            val soldTickets = parameters.arguments?.getInt("soldTickets") ?: 0
            val profilePic = parameters.arguments?.getInt("profilePic") ?: 0

            PlayerView(
                navController,
                message,
                id,
                name,
                mail,
                semester,
                career,
                hasScolarship,
                gpa.toFloat(),
                soldTickets,
            )
        }
    }
}