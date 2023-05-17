package com.loveuba.tryoneapplication.data.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.loveuba.tryoneapplication.data.TryData
import com.loveuba.tryoneapplication.data.models.TotalFootballData
import retrofit2.Response

interface ITryRepository {

    suspend fun getTry(): Response<TotalFootballData>

}