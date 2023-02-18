package com.example.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class rcvAdapter(val requiredContext :Context ,private val phoneDetails :ArrayList<phonelist>): RecyclerView.Adapter<rcvAdapter.exampleViewHolder>() {

    class exampleViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val personImage:ImageView =itemView.findViewById(R.id.imageView)
            val personName :TextView =itemView.findViewById(R.id.tv_name)
        val phoneNumber :TextView =itemView.findViewById(R.id.tv_phone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rcv_items,parent,false)
        return exampleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return phoneDetails.size
    }

    override fun onBindViewHolder(holder: exampleViewHolder, position: Int) {
        holder.personName.text = phoneDetails[position].personName
        holder.phoneNumber.text =phoneDetails[position].personPhone
        holder.personImage.setImageResource(R.drawable.ic_launcher_background)

    }
}