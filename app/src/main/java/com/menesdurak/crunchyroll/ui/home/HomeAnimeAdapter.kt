package com.menesdurak.crunchyroll.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.menesdurak.crunchyroll.data.entity.Anime
import com.menesdurak.crunchyroll.databinding.ItemAnimeBinding

class HomeAnimeAdapter : RecyclerView.Adapter<HomeAnimeAdapter.AnimeHolder>() {

    private val animes = mutableListOf<Anime>()

    inner class AnimeHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(anime: Anime) {
            binding.ivItem.setImageResource(
                binding.root.resources.getIdentifier(
                    anime.image,
                    "drawable",
                    binding.root.context.packageName
                )
            )
            binding.tvTitle.text = if (anime.name.length > 20) {
                anime.name.substring(0, 20) + "..."
            } else {
                anime.name
            }
            binding.tvDubType.text = anime.dubbing.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeHolder {
        val binding = ItemAnimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeHolder(binding)
    }

    override fun getItemCount(): Int = animes.size

    override fun onBindViewHolder(holder: AnimeHolder, position: Int) {
        holder.bind(animes[position])
    }

    fun updateAnimeList(newAnimes: List<Anime>) {
        animes.clear()
        animes.addAll(newAnimes)
        notifyDataSetChanged()
    }
}