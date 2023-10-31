package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter20(private var list20: List<House>): RecyclerView.Adapter<Adapter20.ViewHolder20>() {

    class ViewHolder20(itemView20: View): RecyclerView.ViewHolder(itemView20){
        val name20: TextView = itemView20.findViewById(R.id.house)
        val loc20: TextView = itemView20.findViewById(R.id.location)
        val price20: TextView = itemView20.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder20 {
        val view20 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder20(view20)
    }

    override fun getItemCount(): Int {
        return list20.size
    }

    override fun onBindViewHolder(holder: ViewHolder20, position: Int) {
        val sample20 = list20[position]
        holder.name20.text = sample20.name
        holder.loc20.text = sample20.location
        holder.price20.text = sample20.price
    }

}