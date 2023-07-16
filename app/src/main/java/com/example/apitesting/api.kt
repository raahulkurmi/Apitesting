package com.example.apitesting

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object api {
   val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
   val Api by lazy {
        retrofit.create(Apiinterface::class.java)
    }
}