package com.trivia.data.remote.retrofit

import com.trivia.data.remote.urls_keys.URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val retrofit =
        Retrofit.Builder().baseUrl(URL.BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
}