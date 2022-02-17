package com.example.HomeWorkPodShop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.HomeWorkPodShop.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.HomeWorkPodShop.fragments.GridFragment
import com.example.HomeWorkPodShop.fragments.LinearFragment

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNav = findViewById(R.id.bottom_nav)

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.linearFragment_bn -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container_home, LinearFragment()).commit()
                }

                R.id.gridFragment_bn -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container_home, GridFragment()).commit()

                }
            }
            true
        }

    }
}