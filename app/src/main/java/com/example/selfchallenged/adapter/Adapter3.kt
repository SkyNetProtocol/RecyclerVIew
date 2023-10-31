package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter3 (private var list3: List<House>) : RecyclerView.Adapter<Adapter3.ViewHolder3>() {

    class ViewHolder3 (itemView3: View) : RecyclerView.ViewHolder(itemView3){
        val name3 : TextView = itemView3.findViewById(R.id.house)
        val loc3 : TextView = itemView3.findViewById(R.id.location)
        val price3 : TextView = itemView3.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder3 {
        val view3 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder3(view3)
    }

    override fun getItemCount(): Int {
        return list3.size
    }

    override fun onBindViewHolder(holder: ViewHolder3, position: Int) {
        val sample3 = list3[position]
        holder.name3.text  = sample3.name
        holder.loc3.text = sample3.location
        holder.price3.text = sample3.price
    }
}