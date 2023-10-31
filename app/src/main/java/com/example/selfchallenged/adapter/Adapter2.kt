package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter2 (private var list2: List<House>) : RecyclerView.Adapter<Adapter2.ViewHolder2>() {

    class  ViewHolder2(itemView2: View) : RecyclerView.ViewHolder(itemView2){
        val name2 : TextView = itemView2.findViewById(R.id.house)
        val loc2 : TextView = itemView2.findViewById(R.id.location)
        val price2 : TextView = itemView2.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder2 {
        val view2 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder2(view2)
    }

    override fun getItemCount(): Int {
        return list2.size
    }

    override fun onBindViewHolder(holder: ViewHolder2, position: Int) {
        val sample2 = list2[position]
        holder.name2.text = sample2.name
        holder.loc2.text = sample2.location
        holder.price2.text = sample2.price
    }

}