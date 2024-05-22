package com.example.ducktales

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient
{
    private const val URL = "https://duckiecool.azurewebsites.net/sendDuckie?"
    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build()

        retrofit.create(ApiService::class.java)
    }
}