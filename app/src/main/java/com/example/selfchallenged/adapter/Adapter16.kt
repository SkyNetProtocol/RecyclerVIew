package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter16(private var list16: List<House>) : RecyclerView.Adapter<Adapter16.ViewHolder16>() {

    class ViewHolder16(itemView16: View): RecyclerView.ViewHolder(itemView16){
        val name16: TextView = itemView16.findViewById(R.id.house)
        val loc16: TextView = itemView16.findViewById(R.id.location)
        val price16: TextView = itemView16.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder16 {
        val view16 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder16(view16)
    }

    override fun getItemCount(): Int {
        return list16.size
    }

    override fun onBindViewHolder(holder: ViewHolder16, position: Int) {
        val sample = list16[position]
        holder.name16.text = sample.name
        holder.loc16.text = sample.location
        holder.price16.text = sample.price
    }
}