package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter8(private var list8: List<House>) : RecyclerView.Adapter<Adapter8.ViewHolder8>() {

    class ViewHolder8(itemView8: View): RecyclerView.ViewHolder(itemView8){
        val name8 : TextView = itemView8.findViewById(R.id.house)
        val loc8 : TextView = itemView8.findViewById(R.id.location)
        val price8 : TextView = itemView8.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder8 {
        val view8 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder8(view8)
    }

    override fun getItemCount(): Int {
        return list8.size
    }

    override fun onBindViewHolder(holder: ViewHolder8, position: Int) {
        val sample8 = list8[position]
        holder.name8.text = sample8.name
        holder.loc8.text = sample8.location
        holder.price8.text = sample8.price
    }

}