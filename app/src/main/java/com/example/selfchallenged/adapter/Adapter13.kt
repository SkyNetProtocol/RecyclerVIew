package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter13(private var list13: List<House>): RecyclerView.Adapter<Adapter13.ViewHolder13>(){

    class ViewHolder13(itemView13: View): RecyclerView.ViewHolder(itemView13){
        val name13: TextView = itemView13.findViewById(R.id.house)
        val loc13: TextView = itemView13.findViewById(R.id.location)
        val price13: TextView = itemView13.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder13 {
        val view13 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder13(view13)
    }

    override fun getItemCount(): Int {
        return list13.size
    }

    override fun onBindViewHolder(holder: ViewHolder13, position: Int) {
        val sample13 = list13[position]
        holder.name13.text = sample13.name
        holder.loc13.text = sample13.location
        holder.price13.text = sample13.price
    }
}