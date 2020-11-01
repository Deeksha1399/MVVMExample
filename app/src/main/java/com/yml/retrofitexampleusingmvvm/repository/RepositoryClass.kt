package com.yml.retrofitexampleusingmvvm.repository

import com.yml.retrofitexample2.RetrofitInitializer
import com.yml.retrofitexampleusingmvvm.network.APIInterface
import com.yml.retrofitexampleusingmvvm.network.APIResponseInterface
import com.yml.retrofitexampleusingmvvm.network.model.Data
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryClass {
    private val retro = RetrofitInitializer.getRetrofitInstance()
    private val apiInterface: APIInterface = retro.create(APIInterface::class.java)

    fun getPosts(apiResponseInterface: APIResponseInterface) {
        val objects: Call<Data> = apiInterface.getPosts()
        objects.enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }

    fun getUsers(apiResponseInterface: APIResponseInterface) {
        val objects: Call<Data> = apiInterface.getUsers()
        objects.enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }

    fun getComments(apiResponseInterface: APIResponseInterface) {
        val objects: Call<Data> = apiInterface.getComments()
        objects.enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }

    fun getTodos(apiResponseInterface: APIResponseInterface) {
        val objects: Call<Data> = apiInterface.getTodos()
        objects.enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }

    fun getCategories(apiResponseInterface: APIResponseInterface) {
        val objects: Call<Data> = apiInterface.getCategories()
        objects.enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }

    fun getProducts(apiResponseInterface: APIResponseInterface) {
        val objects: Call<Data> = apiInterface.getProducts()
        objects.enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }

        })
    }

    fun getProductCategories(apiResponseInterface: APIResponseInterface) {
        val objects: Call<Data> = apiInterface.getProductCategories()
        objects.enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }
}