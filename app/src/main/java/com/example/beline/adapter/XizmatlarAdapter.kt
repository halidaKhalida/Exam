package com.example.beline.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.beline.R
import com.example.beline.model.Xizmatlar

class XizmatlarAdapter( val list:ArrayList<Xizmatlar>):

    RecyclerView.Adapter<XizmatlarAdapter.XixmatlarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): XixmatlarViewHolder {
        val view:View
        view=LayoutInflater.from(parent.context).inflate(R.layout.itea_xizmatlar,parent,false)
        return XixmatlarViewHolder(view)
    }

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: XixmatlarViewHolder, position: Int) {
        val feeds=list[position]
        holder.apply {

        }
    }
    class XixmatlarViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvxizn=view.findViewById<TextView>(R.id.tv_xizmatlar)
    }
}