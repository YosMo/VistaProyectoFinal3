package com.example.vistaproyectofinal.viewmodels

import com.example.vistaproyectofinal.models.Player


class PlayerViewModels {
    init {}

    fun getPlayerList(): ArrayList<Player> {
        var playerList: ArrayList<Player> = ArrayList<Player>()

        //Create list
        playerList.add(Player("QB", "Miguel Cervantes", 14))
        playerList.add(Player("RB", "Axel Zavala", 12))
        playerList.add(Player("WR", "Raymundo Gutierrez", 83))
        playerList.add(Player("WR", "Erick Limon", 10))
        playerList.add(Player("WR", "Diego Alvarado", 17))
        playerList.add(Player("RB", "Humberto Venado", 23))
        playerList.add(Player("WR", "Jerry Alvarez", 7))
        playerList.add(Player("WR", "Osiel Isaguirre", 50))
        playerList.add(Player("WR", "Erick Zavaleta", 15))
        playerList.add(Player("QB", "Seth Becerra", 19))


        return playerList
    }
}