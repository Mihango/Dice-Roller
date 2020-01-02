package com.example.diceroller

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {
    val randomLiveData = MutableLiveData<Int>()

    fun generateNo(): Int {
        return Random().nextInt(6) + 1
    }
}