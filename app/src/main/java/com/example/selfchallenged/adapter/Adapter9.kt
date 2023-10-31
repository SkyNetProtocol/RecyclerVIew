package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter9(private var list9: List<House>): RecyclerView.Adapter<Adapter9.ViewHolder9>() {

    class ViewHolder9(itemView9: View): RecyclerView.ViewHolder(itemView9){
        val name9 : TextView = itemView9.findViewById(R.id.house)
        val loc9 : TextView = itemView9.findViewById(R.id.location)
        val price9 : TextView = itemView9.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder9 {
        val view9 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder9(view9)
    }

    override fun getItemCount(): Int {
        return list9.size
    }

    override fun onBindViewHolder(holder: ViewHolder9, position: Int) {
        val sample9 = list9[position]
        holder.name9.text = sample9.name
        holder.loc9.text = sample9.location
        holder.price9.text = sample9.price
    }
}