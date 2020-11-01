package com.yml.retrofitexampleusingmvvm.network

import com.yml.retrofitexampleusingmvvm.network.model.Data
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("/public-api/posts")
    fun getPosts(): Call<Data>

    @GET("/public-api/users")
    fun getUsers(): Call<Data>

    @GET("/public-api/comments")
    fun getComments(): Call<Data>

    @GET("/public-api/todos")
    fun getTodos(): Call<Data>

    @GET("/public-api/categories")
    fun getCategories(): Call<Data>

    @GET("/public-api/products")
    fun getProducts(): Call<Data>

    @GET("/public-api/product-categories")
    fun getProductCategories(): Call<Data>
}

