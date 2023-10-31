package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter4(private var list4: List<House>) : RecyclerView.Adapter<Adapter4.ViewHolder4>() {

    class ViewHolder4 (itemView4: View): RecyclerView.ViewHolder(itemView4){
        val name4 : TextView = itemView4.findViewById(R.id.house)
        val loc4 : TextView = itemView4.findViewById(R.id.location)
        val price4 : TextView = itemView4.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder4 {
        val view4 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)
        return ViewHolder4(view4)
    }

    override fun getItemCount(): Int {
        return list4.size
    }

    override fun onBindViewHolder(holder: ViewHolder4, position: Int) {
        val sample4 = list4[position]
        holder.name4.text = sample4.name
        holder.loc4.text = sample4.location
        holder.price4.text = sample4.price
    }

}