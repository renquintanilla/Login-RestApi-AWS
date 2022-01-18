package com.example.loginapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiServices {
    @GET
    suspend fun getUserName(@Url url:String): Response<UserResponses> // Para capturar la URL

}