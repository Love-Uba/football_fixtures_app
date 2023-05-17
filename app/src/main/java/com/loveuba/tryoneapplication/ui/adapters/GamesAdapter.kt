package com.example.mobilechallengeone.ui.adapter

import android.app.Activity
import android.content.Context
import android.provider.Settings.Global.getString
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.TypedArrayUtils.getString
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.loveuba.tryoneapplication.R
import com.loveuba.tryoneapplication.data.models.Matches
import com.loveuba.tryoneapplication.databinding.GameItemBinding
import com.loveuba.tryoneapplication.getTimeDifference

class GamesAdapter(private val gameList: ArrayList<Matches>, var avg: String) :
    RecyclerView.Adapter<GamesAdapter.GamesViewHolder>() {

    private var onItemClickListener: ((position: Int) -> Unit)? = null


    fun filterGames(games: ArrayList<Matches>): List<Matches>{
        return games.filter { it.competition.name== avg }
    }


        inner class GamesViewHolder(private val binding: GameItemBinding, onItemClickListener: ((position: Int) -> Unit)?
        ) : RecyclerView.ViewHolder(binding.root) {
            init {
                itemView.setOnClickListener {
                    val position = adapterPosition
                    if (position != RecyclerView.NO_POSITION) {
                        onItemClickListener?.invoke(position)
                    }
                }
            }

        fun bind(games: Matches) {
            Log.d("GamesAdapter", "bind: ${filterGames(gameList)}")
            binding.homeName.text = games.homeTeam.name
            binding.awayName.text = games.awayTeam.name
            if(games.status == "TIMED"){
                binding.playedScores.visibility = View.GONE
                binding.matchPlaytime.visibility = View.VISIBLE
                binding.matchDate.text = games.utcDate.subSequence(1,8)
                binding.matchTime.text = games.utcDate.subSequence(10,14)
            }else if(games.status == "IN_PLAY"){
                binding.matchPlaytime.text = getTimeDifference(games.utcDate)
                binding.matchScore.text = itemView.resources.getString(R.string.game_score, games.score.fullTime?.home, games.score.fullTime?.away)
            }else if(games.status == "FINISHED"){
                binding.matchPlaytime.text = "FULL TIME"
                binding.matchScore.text = itemView.resources.getString(R.string.game_score, games.score.fullTime?.home, games.score.fullTime?.away)
            }else{
                binding.playedScores.visibility = View.GONE
                binding.matchPlaytime.visibility = View.VISIBLE
                binding.matchTime.visibility = View.GONE
                binding.matchDate.text = "POSTPONED"
            }

            Glide.with(binding.root.context)
                .load(games.homeTeam.crest)
                .into(binding.homeImg)
            Glide.with(binding.root.context)
                .load(games.awayTeam.crest)
                .into(binding.awayImg)
        }
    }

    fun setOnItemClickListener(onItemClickListener: (position: Int) -> Unit) {
        this.onItemClickListener = onItemClickListener
    }

    private fun showToast(adapterPosition: Int, context: Context) {
        Toast.makeText(
            context,
            "${gameList[adapterPosition].competition.name}", Toast.LENGTH_LONG
        ).show()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder {
        val view = LayoutInflater.from(parent.context)
        val bnd = GameItemBinding.inflate(view, parent, false)
        return GamesViewHolder(bnd, onItemClickListener)
    }

    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        holder.bind(filterGames(gameList)[position])
    }

    override fun getItemCount(): Int {
        return filterGames(gameList).size
    }
}