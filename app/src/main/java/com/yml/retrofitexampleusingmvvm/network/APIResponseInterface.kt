package com.yml.retrofitexampleusingmvvm.network

import com.yml.retrofitexampleusingmvvm.network.model.ResponseObjects

interface APIResponseInterface {
    fun onResponse(response: List<ResponseObjects>)
    fun onFailure(t: Throwable)
}