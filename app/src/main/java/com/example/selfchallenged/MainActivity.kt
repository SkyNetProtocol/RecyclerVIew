package com.example.selfchallenged

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.selfchallenged.adapter.Adapter20
import com.example.selfchallenged.databinding.ActivityMainBinding
import com.example.selfchallenged.model.House

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var houseViewModel: HouseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        houseViewModel = ViewModelProvider(this)[HouseViewModel::class.java]

        val recyclerView = binding.recyclerView

        val houseObserver = Observer<List<House>> { houseList ->
            val adapter = Adapter20(houseList)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter
        }

        houseViewModel.getHouseList().observe(this, houseObserver)

    }
}