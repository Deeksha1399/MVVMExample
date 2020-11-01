package com.yml.retrofitexampleusingmvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yml.retrofitexampleusingmvvm.R

class AdapterClass(private val userList: List<Any>) :
    RecyclerView.Adapter<AdapterClass.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(itemView)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val newItemView: TextView = itemView.findViewById(R.id.item)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.newItemView.text = userList[position].toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}