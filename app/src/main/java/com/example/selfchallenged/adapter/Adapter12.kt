package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter12 (private var list12: List<House>): RecyclerView.Adapter<Adapter12.ViewHolder12>() {

    class ViewHolder12(itemView12: View): RecyclerView.ViewHolder(itemView12){
        val name12: TextView = itemView12.findViewById(R.id.house)
        val loc12: TextView = itemView12.findViewById(R.id.location)
        val price12: TextView = itemView12.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder12 {
        val view12 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder12(view12)
    }

    override fun getItemCount(): Int {
        return  list12.size
    }

    override fun onBindViewHolder(holder: ViewHolder12, position: Int) {
        val sample12 = list12[position]
        holder.name12.text = sample12.name
        holder.loc12.text = sample12.location
        holder.price12.text = sample12.price
    }

}