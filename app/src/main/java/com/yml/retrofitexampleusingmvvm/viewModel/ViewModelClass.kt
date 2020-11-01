package com.yml.retrofitexampleusingmvvm.viewModel

import com.yml.retrofitexampleusingmvvm.network.APIResponseInterface
import com.yml.retrofitexampleusingmvvm.network.model.ResponseObjects
import com.yml.retrofitexampleusingmvvm.repository.RepositoryClass

class ViewModelClass {
    private var repositoryClass: RepositoryClass? = null

    fun getPosts(viewCallBack: APIResponseInterface) {
        repositoryClass = RepositoryClass()
        repositoryClass?.getPosts(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }
        })
    }

    fun getUsers(viewCallBack: APIResponseInterface) {
        repositoryClass = RepositoryClass()
        repositoryClass?.getUsers(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }

    fun getComments(viewCallBack: APIResponseInterface) {
        repositoryClass = RepositoryClass()
        repositoryClass?.getComments(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }

    fun getTodos(viewCallBack: APIResponseInterface) {
        repositoryClass = RepositoryClass()
        repositoryClass?.getTodos(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }

    fun getCategories(viewCallBack: APIResponseInterface) {
        repositoryClass = RepositoryClass()
        repositoryClass?.getCategories(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }

    fun getProducts(viewCallBack: APIResponseInterface) {
        repositoryClass = RepositoryClass()
        repositoryClass?.getProducts(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }

    fun getProductCategories(viewCallBack: APIResponseInterface) {
        repositoryClass = RepositoryClass()
        repositoryClass?.getProductCategories(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)

            }

        })
    }
}