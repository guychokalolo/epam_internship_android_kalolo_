package com.guychokalolo.epam_internship_android_kalolo.network.retrofitclient

import com.guychokalolo.epam_internship_android_kalolo.network.api.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

private val retrofit =
            Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

object FoodApi{
    val retrofitService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}




