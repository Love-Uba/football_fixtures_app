package com.loveuba.tryoneapplication.data

import com.loveuba.tryoneapplication.data.models.TotalFootballData
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface TryService {

    @GET("/v4/matches")
    suspend fun getTry(): Response<TotalFootballData>

}