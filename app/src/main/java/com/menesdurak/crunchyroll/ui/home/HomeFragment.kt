package com.menesdurak.crunchyroll.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.menesdurak.crunchyroll.R
import com.menesdurak.crunchyroll.data.MockData
import com.menesdurak.crunchyroll.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val forYouAnimeAdapter: HomeAnimeAdapter by lazy { HomeAnimeAdapter() }
    private val mostPopularAnimeAdapter: HomeAnimeAdapter by lazy { HomeAnimeAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        with(binding.rvForYou) {
            adapter = forYouAnimeAdapter
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        with(binding.rvMostPopular) {
            adapter = mostPopularAnimeAdapter
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        forYouAnimeAdapter.updateAnimeList(MockData.animesForYou)
        mostPopularAnimeAdapter.updateAnimeList(MockData.animesMostPopular)

        return binding.root
    }

}