package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter11(private var list11: List<House>): RecyclerView.Adapter<Adapter11.ViewHolder11>() {

    class ViewHolder11(itemView11: View): RecyclerView.ViewHolder(itemView11){
        val name11: TextView = itemView11.findViewById(R.id.house)
        val loc11: TextView = itemView11.findViewById(R.id.location)
        val price11: TextView = itemView11.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder11 {
        val view11 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder11(view11)
    }

    override fun getItemCount(): Int {
        return list11.size
    }

    override fun onBindViewHolder(holder: ViewHolder11, position: Int) {
        val sample11 = list11[position]
        holder.name11.text = sample11.name
        holder.loc11.text = sample11.location
        holder.price11.text = sample11.price
    }
}