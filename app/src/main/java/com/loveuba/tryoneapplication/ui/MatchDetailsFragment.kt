package com.loveuba.tryoneapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.loveuba.tryoneapplication.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MatchDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match_details, container, false)
    }

}