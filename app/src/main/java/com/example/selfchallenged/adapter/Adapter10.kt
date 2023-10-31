package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter10  (private var list10: List<House>): RecyclerView.Adapter<Adapter10.ViewHolder10>() {

    class ViewHolder10 (itemView10: View): RecyclerView.ViewHolder(itemView10){
        val name10: TextView = itemView10.findViewById(R.id.house)
        val loc10: TextView = itemView10.findViewById(R.id.location)
        val price10: TextView = itemView10.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder10 {
        val view10 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder10(view10)
    }

    override fun getItemCount(): Int {
        return list10.size
    }

    override fun onBindViewHolder(holder: ViewHolder10, position: Int) {
        val sample10 = list10[position]
        holder.name10.text = sample10.name
        holder.loc10.text = sample10.location
        holder.price10.text = sample10.price
    }
}