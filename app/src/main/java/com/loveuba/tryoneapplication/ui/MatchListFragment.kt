package com.loveuba.tryoneapplication.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.mobilechallengeone.ui.adapter.CompetitionAdapter
import com.example.mobilechallengeone.ui.adapter.GamesAdapter
import com.loveuba.tryoneapplication.R
import com.loveuba.tryoneapplication.data.models.Matches
import com.loveuba.tryoneapplication.databinding.FragmentMatchListBinding
import com.loveuba.tryoneapplication.viewmodel.TryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MatchListFragment : Fragment() {

    private lateinit var binding: FragmentMatchListBinding
    private val sessionAdapter = CompetitionAdapter()
    private val tryViewModel : TryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMatchListBinding.inflate(layoutInflater)
        tryViewModel.getTry()

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        tryViewModel.getTry()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.adapter = sessionAdapter

        tryViewModel.gamesList.observe(viewLifecycleOwner) { result ->
            result?.let{sessionAdapter.populateView(it)}
        }
    }

}