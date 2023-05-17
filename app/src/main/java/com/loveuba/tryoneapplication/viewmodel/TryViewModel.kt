package com.loveuba.tryoneapplication.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.loveuba.tryoneapplication.data.models.TotalFootballData
import com.loveuba.tryoneapplication.data.repo.ITryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TryViewModel @Inject constructor(private val repository: ITryRepository) : ViewModel(){

    companion object{
        const val TAG = "TRYVIEWMODEL"
    }

    private val _gamesList: MutableLiveData<TotalFootballData> = MutableLiveData()

            val gamesList : LiveData<TotalFootballData>
            get() = _gamesList

    fun getTry(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                 val response = repository.getTry()
                if(response.isSuccessful){
                    _gamesList.postValue(response.body())
                }else{
                    Log.d(TAG,": ${response.body()}")
                }
            }catch (ex: Exception){
                ex.message?.let { Log.e(TAG, it) }
            }
        }
    }

}