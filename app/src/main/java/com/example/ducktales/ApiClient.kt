package com.example.ducktales

import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

class ApiClient
{
}

interface ApiService
{
    @POST("/sendDuckie")
    fun sendEmail(@Body request: EmailRequest): Call<ResponseBody>
}