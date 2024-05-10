package com.example.vistaproyectofinal.network

import com.example.vistaproyectofinal.models.Quote
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIInterface {
    //Peticion GET y URL relativa
    @GET("phrase")
    suspend fun getQuote() : Response<Quote>
}