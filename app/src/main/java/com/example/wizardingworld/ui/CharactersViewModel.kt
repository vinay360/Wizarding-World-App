package com.example.wizardingworld.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizardingworld.network.Characters
import com.example.wizardingworld.network.HpApi
import kotlinx.coroutines.launch

enum class Status {
    LOADING,
    DONE,
    ERROR
}

class CharactersViewModel: ViewModel() {
    private var _characters = MutableLiveData<List<Characters>>()
    private var _status = MutableLiveData<Status> ()

    val characters : LiveData<List<Characters>>
        get() = _characters
    val status : LiveData<Status>
        get() = _status
    init {
        getCharacters()
    }

    private fun getCharacters() {
        viewModelScope.launch {
            Log.d("val", "yes")
            _characters.value = HpApi.retrofitService.getChars()
            Log.d("val", "done")
        }
    }
}