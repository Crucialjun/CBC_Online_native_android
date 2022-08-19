package com.example.cbconlinenative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cbconlinenative.adapters.OnboardingViewpagerAdapter
import com.example.cbconlinenative.databinding.ActivityOnboardingBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtAppName.text = GlobalConstants.APP_NAME

        binding.onboardingViewpager.adapter = OnboardingViewpagerAdapter(this)

        binding.btnOnboardingSkip.setOnClickListener {
            binding.onboardingViewpager.setCurrentItem(5,false)
        }

        TabLayoutMediator(binding.tabLayout,binding.onboardingViewpager){tab,position ->

        }.attach()
    }


}