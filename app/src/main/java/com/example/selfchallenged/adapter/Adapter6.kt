package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter6(private var list6: List<House>) : RecyclerView.Adapter<Adapter6.ViewHolder6>() {

    class ViewHolder6 (itemView6: View): RecyclerView.ViewHolder(itemView6){
        val name6 : TextView = itemView6.findViewById(R.id.house)
        val loc6 : TextView = itemView6.findViewById(R.id.location)
        val price6 : TextView = itemView6.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder6 {
        val view6 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent,false)

        return ViewHolder6(view6)
    }

    override fun getItemCount(): Int {
        return list6.size
    }

    override fun onBindViewHolder(holder: ViewHolder6, position: Int) {
        val sample6 = list6[position]
        holder.name6.text = sample6.name
        holder.loc6.text = sample6.location
        holder.price6.text = sample6.price
    }

}