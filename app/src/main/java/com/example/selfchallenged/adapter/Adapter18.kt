package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter18 (private var list18: List<House>): RecyclerView.Adapter<Adapter18.ViewHolder18>() {

    class ViewHolder18(itemView18: View): RecyclerView.ViewHolder(itemView18){
        val name18: TextView = itemView18.findViewById(R.id.house)
        val loc18: TextView = itemView18.findViewById(R.id.location)
        val price18: TextView = itemView18.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder18 {
        val view18 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder18(view18)
    }

    override fun getItemCount(): Int {
        return list18.size
    }

    override fun onBindViewHolder(holder: ViewHolder18, position: Int) {
        val sample18 = list18[position]
        holder.name18.text = sample18.name
        holder.loc18.text = sample18.location
        holder.price18.text = sample18.price
    }

}