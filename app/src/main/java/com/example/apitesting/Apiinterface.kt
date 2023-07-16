package com.example.apitesting

import retrofit2.Call
import retrofit2.http.GET

interface Apiinterface {
    @GET("posts")
   fun getdata():Call<List<pojoItem>>
}