package com.example.selfchallenged.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter7 (private var list7: List<House>) : RecyclerView.Adapter<Adapter7.ViewHolder7>() {

    class ViewHolder7 (itemView7: View): RecyclerView.ViewHolder(itemView7){
        val name7 : TextView = itemView7.findViewById(R.id.house)
        val loc7 : TextView = itemView7.findViewById(R.id.location)
        val price7 : TextView = itemView7.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder7 {
        val view7 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder7(view7)
    }

    override fun getItemCount(): Int {
        return list7.size
    }

    override fun onBindViewHolder(holder: ViewHolder7, position: Int) {
        val sample7 = list7[position]
        holder.name7.text = sample7.name
        holder.loc7.text = sample7.location
        holder.price7.text = sample7.price
    }
}