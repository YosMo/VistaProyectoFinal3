package com.example.vistaproyectofinal.viewmodels

import com.example.vistaproyectofinal.R
import com.example.vistaproyectofinal.models.Player


class PlayerViewModels {
    init {}

    fun getPlayerList(): ArrayList<Player> {
        var playerList: ArrayList<Player> = ArrayList<Player>()

        //Create list
        playerList.add(Player("Jalen Green", 20 , 76, "HOU", 2023,566, 43, 241, 284,281,59,18,200, 131, 1683, R.drawable.jugador, 14))
        playerList.add(Player("Jabari Smith Jr.", 19 , 79, "HOU", 2023,364, 122,447,569,101,43,74,104,227,1010,R.drawable.jugador, 12))
        playerList.add(Player("Kenyon Martin Jr.", 22 , 82, "HOU", 2023,410, 126,326,452,123,41,30,91,147,1039, R.drawable.jugador, 83))
        playerList.add(Player("Kevin Porter Jr.", 22 , 59, "HOU", 2023,391, 76,238,314,338,82,17,188,156,1130, R.drawable.jugador, 10))
        playerList.add(Player("Tari Eason", 21 , 82, "HOU", 2023,296, 195,301,496,88,96,47,101,189,760, R.drawable.jugador, 17))
        playerList.add(Player("Eric Gordon", 34 , 47, "HOU", 2023,210, 12,85,97,136,30,17,83,45,615, R.drawable.jugador, 23))
        playerList.add(Player("Usman Garuba", 20 , 75, "HOU", 2023,86, 120,187,307,64,44,29,47,135,225, R.drawable.jugador, 15))
        playerList.add(Player("Daishen Nix", 20 , 57, "HOU", 2023,81, 18,80,98,132,31,7,86,59,226, R.drawable.jugador, 32))
        playerList.add(Player("Josh Christopher", 21 , 64, "HOU", 2023,153, 20,51,71,73,33,15,60,59,372, R.drawable.jugador, 19))
        playerList.add(Player("Garrison Mathews", 26 , 45, "HOU", 2023,60,10,52,62,23,23,4,18,56,214, R.drawable.jugador, 20))
        playerList.add(Player("P.J. Tucker", 37 , 75, "HOU", 2023,96,95,200,295,60,39,15,44,180,266, R.drawable.jugador, 24))


        return playerList
    }
}
