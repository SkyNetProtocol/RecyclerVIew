package com.example.selfchallenged.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.databinding.ViewHouseBinding
import com.example.selfchallenged.model.House

class Adapter20(private var list20: List<House>): RecyclerView.Adapter<Adapter20.ViewHolder20>() {

    class ViewHolder20(private val binding: ViewHouseBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: House) {
            binding.house.text = item.name
            binding.location.text = item.location
            binding.price.text = item.price
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder20 {
        val view20 = LayoutInflater.from(parent.context)
        val binding = ViewHouseBinding.inflate(view20, parent, false)
        return ViewHolder20(binding)
    }

    override fun getItemCount(): Int {
        return list20.size
    }

    override fun onBindViewHolder(holder: ViewHolder20, position: Int) {
        val item = list20[position]
        holder.bind(item)
    }

}