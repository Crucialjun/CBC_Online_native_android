package com.example.cbconlinenative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cbconlinenative.adapters.OnboardingViewpagerAdapter
import com.example.cbconlinenative.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtAppName.text = GlobalConstants.APP_NAME

        binding.onboardingViewpager.adapter = OnboardingViewpagerAdapter(this)
    }


}