package com.example.HomeWorkPodShop.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.HomeWorkPodShop.databinding.FragmentDetailBinding
import com.example.HomeWorkPodShop.models.ModelClass

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        val item = arguments?.getSerializable("KEY") as ModelClass

        Glide.with(requireContext()).load(item.image).into(binding.imageDetail)
        binding.nameDetail.text = item.name
        binding.description2.text = item.description
        binding.detailDescription.text = item.detailDescription



        return binding.root
    }
}