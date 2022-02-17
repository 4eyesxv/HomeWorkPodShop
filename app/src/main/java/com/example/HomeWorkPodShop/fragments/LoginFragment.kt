package com.example.HomeWorkPodShop.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.HomeWorkPodShop.HomeActivity
import com.example.HomeWorkPodShop.databinding.FragmentLoginBinding
import com.example.HomeWorkPodShop.services.SharedPreference

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val sharedPref = context?.let { SharedPreference(it) }
        if(!sharedPref?.login.isNullOrBlank() && !sharedPref?.password.isNullOrBlank()){
            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.saveBtn.setOnClickListener {
            sharedPref?.login = binding.loginEdittext.text.toString()
            sharedPref?.password = binding.passwordEdittext.text.toString()
            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }

        return binding.root
    }

}