package com.yml.retrofitexampleusingmvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yml.retrofitexampleusingmvvm.network.model.ResponseObjects
import com.yml.retrofitexampleusingmvvm.R
import com.yml.retrofitexampleusingmvvm.adapter.AdapterClass
import com.yml.retrofitexampleusingmvvm.network.APIResponseInterface
import com.yml.retrofitexampleusingmvvm.viewModel.ViewModelClass

private lateinit var recycler:RecyclerView
class TodosFragment : Fragment(R.layout.fragment_todos) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler =view.findViewById(R.id.rv_todos)
        recycler.layoutManager= LinearLayoutManager(view.context)
        val mainViewModel = ViewModelClass()
        mainViewModel.getTodos(object : APIResponseInterface {
            override fun onResponse(response: List<ResponseObjects>) {
                recycler.adapter = AdapterClass(response)
            }

            override fun onFailure(t: Throwable) {
                Toast.makeText(view.context,t.toString(), Toast.LENGTH_LONG).show()
            }
        })

    }

}