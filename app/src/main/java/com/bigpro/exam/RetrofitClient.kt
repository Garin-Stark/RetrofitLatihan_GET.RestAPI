package com.bigpro.exam

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    //Menampung Base URL
    private const val BASE_URL ="https://jsonplaceholder.typicode.com/"


    // Buat instance
    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(Api::class.java)

    }


}