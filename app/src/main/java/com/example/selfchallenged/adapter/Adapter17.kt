package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter17 (private var list17: List<House>) : RecyclerView.Adapter<Adapter17.ViewHolder17>(){

    class ViewHolder17(itemView17: View): RecyclerView.ViewHolder(itemView17){
        val name17: TextView = itemView17.findViewById(R.id.house)
        val loc17: TextView = itemView17.findViewById(R.id.location)
        val price17: TextView = itemView17.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder17 {
        val view17 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder17(view17)
    }

    override fun getItemCount(): Int {
        return list17.size
    }

    override fun onBindViewHolder(holder: ViewHolder17, position: Int) {
        val sample17 = list17[position]
        holder.name17.text = sample17.name
        holder.loc17.text = sample17.location
        holder.price17.text = sample17.price
    }

}