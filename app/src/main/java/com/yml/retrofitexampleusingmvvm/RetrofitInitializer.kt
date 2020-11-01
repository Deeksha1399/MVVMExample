package com.yml.retrofitexample2

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInitializer {
    private val retrofit: Retrofit by lazy{
        val okHttpClient = OkHttpClient.Builder().build()
        Retrofit.Builder().baseUrl("https://gorest.co.in/").
        addConverterFactory(GsonConverterFactory.create()).
        client(okHttpClient).
        build()
    }
    fun getRetrofitInstance():Retrofit{
        return retrofit
    }

    fun initialize(){
        retrofit
    }

}