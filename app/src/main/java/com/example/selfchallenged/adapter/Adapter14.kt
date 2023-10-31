package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter14 (private var list14: List<House>): RecyclerView.Adapter<Adapter14.ViewHolder14>() {

    class ViewHolder14(itemView14: View): RecyclerView.ViewHolder(itemView14){
        val name14 : TextView = itemView14.findViewById(R.id.house)
        val loc14 : TextView = itemView14.findViewById(R.id.location)
        val price14 : TextView = itemView14.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder14 {
        val view14 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder14(view14)
    }

    override fun getItemCount(): Int {
        return list14.size
    }

    override fun onBindViewHolder(holder: ViewHolder14, position: Int) {
        val sample14 = list14[position]
        holder.name14.text = sample14.name
        holder.loc14.text = sample14.location
        holder.price14.text = sample14.price
    }
}