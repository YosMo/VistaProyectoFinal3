package com.example.vistaproyectofinal.models

import androidx.annotation.DrawableRes

data class Player (
    val player_name : String,
    val age : Int,
    val games : Int,
    val team : String,
    val season : Int,
    val field_goals: Int,
    val ORB: Int,
    val DRB: Int,
    val TRB: Int,
    val AST: Int,
    val STL: Int,
    val BLK: Int,
    val TOV: Int,
    val PF: Int,
    val PTS: Int,
    @DrawableRes val profilePic: Int,
    val num: Int


)