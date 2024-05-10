package com.example.vistaproyectofinal.network

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


//Configurar retrofit, Creamos el objeto retrofit
object RetrofitHelper {

    private val URL_BASE = "https://frasedeldia.azurewebsites.net/api/"

    fun getRetrofitService(): APIInterface {
        val retrofit = Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service: APIInterface = retrofit.create(APIInterface::class.java)
        return service
    }
}

class API {
    private val service = RetrofitHelper.getRetrofitService()

    suspend fun getRandomQuote(): String {
        val quote: String
        val response = service.getQuote() /*obtenemos la respuesta y aplicamos la logica de que deseamos hacer con los campos*/
        quote = response.body()?.phrase ?: ""
        Log.d("API_PRUEBA ", "La frase es " + response.body()?.phrase)
        return quote
    }

}