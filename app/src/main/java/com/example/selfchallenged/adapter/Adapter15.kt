package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter15(private var list15: List<House>): RecyclerView.Adapter<Adapter15.ViewHolder15>() {

    class ViewHolder15(itemView15: View): RecyclerView.ViewHolder(itemView15){
        val name15: TextView = itemView15.findViewById(R.id.house)
        val loc15: TextView = itemView15.findViewById(R.id.location)
        val price15: TextView = itemView15.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder15 {
        val view15 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder15(view15)
    }

    override fun getItemCount(): Int {
        return list15.size
    }

    override fun onBindViewHolder(holder: ViewHolder15, position: Int) {
        val sample15 = list15[position]
        holder.name15.text = sample15.name
        holder.loc15.text = sample15.location
        holder.price15.text = sample15.price
    }

}