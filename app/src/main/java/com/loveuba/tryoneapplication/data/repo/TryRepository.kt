package com.loveuba.tryoneapplication.data.repo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.loveuba.tryoneapplication.data.TryData
import com.loveuba.tryoneapplication.data.TryService
import com.loveuba.tryoneapplication.data.models.TotalFootballData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject
import javax.security.auth.callback.Callback

class TryRepository @Inject constructor(
    private val tryService: TryService
) : ITryRepository {

    private var TAG = TryRepository::class.java.simpleName

    override suspend fun getTry() : Response<TotalFootballData> {
            return withContext(Dispatchers.IO){
                Log.d(TAG,": ${tryService.getTry().body()}")

                tryService.getTry()

            }
    }

}