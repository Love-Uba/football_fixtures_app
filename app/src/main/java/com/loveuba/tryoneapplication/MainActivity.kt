package com.loveuba.tryoneapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.loveuba.tryoneapplication.databinding.ActivityMainBinding
import com.loveuba.tryoneapplication.viewmodel.TryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
//    private val tryViewModel : TryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
//        binding.refreshBtn.setOnClickListener {
//            tryViewModel.getTry()
//        }

        observeViewmodel()

    }

    override fun onResume() {
        super.onResume()
//        tryViewModel.getTry()
    }

    private fun observeViewmodel() {
//        tryViewModel.gamesList.observe(this){ games ->
//            Log.d("GAAAAAAMESTAG", "observeViewmodel: $games")
//            binding.tryTask.text = games.resultSet.competitions
//        }

    }
}