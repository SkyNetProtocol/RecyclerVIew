package com.example.selfchallenged

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.selfchallenged.model.House

class HouseViewModel: ViewModel() {
    private val houseList = MutableLiveData<List<House>>()

    init {
        houseList.value = listOf(
            House("House 1", "Location 1", "$100,000"),
            House("House 2", "Location 2", "$150,000"),
            House("House 2", "Location 2", "$150,000"),
            House("House 2", "Location 2", "$150,000"),
            House("House 2", "Location 2", "$150,000"),
            House("House 2", "Location 2", "$150,000"),
            House("House 2", "Location 2", "$150,000"),
            // Add more House objects as needed
        )
    }

    fun getHouseList(): LiveData<List<House>> {
        return houseList
    }

}