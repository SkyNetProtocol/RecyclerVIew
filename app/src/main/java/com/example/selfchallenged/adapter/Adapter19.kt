package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter19(private var list19: List<House>): RecyclerView.Adapter<Adapter19.ViewHolder19>() {

    class ViewHolder19 (itemView19: View) : RecyclerView.ViewHolder(itemView19){
        val name19: TextView = itemView19.findViewById(R.id.house)
        val loc19: TextView = itemView19.findViewById(R.id.location)
        val price19: TextView = itemView19.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder19 {
        val view19 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder19(view19)
    }

    override fun getItemCount(): Int {
        return list19.size
    }

    override fun onBindViewHolder(holder: ViewHolder19, position: Int) {
        val sample19 = list19[position]
        holder.name19.text = sample19.name
        holder.loc19.text = sample19.location
        holder.price19.text = sample19.price
    }


}