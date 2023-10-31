package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter5(private var list5: List<House>): RecyclerView.Adapter<Adapter5.ViewHolder5>() {

    class ViewHolder5 (itemView5: View): RecyclerView.ViewHolder(itemView5){
        val name5 : TextView = itemView5.findViewById(R.id.house)
        val loc5 : TextView = itemView5.findViewById(R.id.location)
        val price5 : TextView = itemView5.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder5 {
        val view5 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder5(view5)
    }

    override fun getItemCount(): Int {
        return list5.size
    }

    override fun onBindViewHolder(holder: ViewHolder5, position: Int) {
        val sample5 = list5[position]
        holder.name5.text = sample5.name
        holder.loc5.text = sample5.location
        holder.price5.text = sample5.price
    }

}