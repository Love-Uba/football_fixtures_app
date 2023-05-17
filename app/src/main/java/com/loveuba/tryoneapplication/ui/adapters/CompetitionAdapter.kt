package com.example.mobilechallengeone.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.loveuba.tryoneapplication.data.models.Matches
import com.loveuba.tryoneapplication.data.models.TotalFootballData
import com.loveuba.tryoneapplication.databinding.CompetitionItemBinding

class CompetitionAdapter : RecyclerView.Adapter<CompetitionAdapter.ViewHolder>() {

    private var competitions = ArrayList<Matches>()
//    private var gamesAdapter = GamesAdapter()

    inner class ViewHolder(private val binding : CompetitionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(session: Matches){

            binding.sessionName.text = session.competition.name
            binding.sessTime.text = session.area.name
            binding.sessionExerciseItem.layoutManager = LinearLayoutManager(binding.root.context)
            binding.sessionExerciseItem.adapter = GamesAdapter(competitions, session.competition.name)
//            gamesAdapter.competitions = competitions
//            gamesAdapter.avgBpm = session.competition.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = CompetitionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(competitions[position])
    }

    override fun getItemCount(): Int {
        return competitions.size
    }

    fun populateView(result : TotalFootballData){
        this.competitions = result.matches as ArrayList<Matches>
        notifyDataSetChanged()
    }
}