package com.yml.retrofitexampleusingmvvm.network.model

data class ResponseObjects(
    val id: Int,
    val product_id: Int,
    val category_id: Int,
    val name: String,
    val user_id: Int,
    val description: String,
    val email: String,
    val image: String,
    val price: Long,
    val discount_amount: Long,
    val gender: String,
    val status: String,
    val title: String,
    val body: String,
    val created_at: String,
    val updated_at: String,
    val categories: ProductData
)