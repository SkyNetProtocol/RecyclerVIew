package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.R
import com.example.selfchallenged.model.House

class Adapter1(private var list1: List<House>) : RecyclerView.Adapter<Adapter1.ViewHolder1>() {

    class ViewHolder1 (itemView1: View): RecyclerView.ViewHolder(itemView1){
        val name1 : TextView = itemView1.findViewById(R.id.house)
        val loc1: TextView = itemView1.findViewById(R.id.location)
        val price1: TextView = itemView1.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val view1 = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_house, parent, false)

        return ViewHolder1(view1)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val sample1 = list1[position]
        holder.name1.text = sample1.name
        holder.loc1.text = sample1.location
        holder.price1.text = sample1.location
    }
}