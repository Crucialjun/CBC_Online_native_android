package com.example.cbconlinenative

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cbconlinenative.adapters.OnboardingViewpagerAdapter
import com.example.cbconlinenative.databinding.ActivityOnboardingBinding
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

        binding.btnOnboardingSignup.setOnClickListener {
            val intent  = Intent(this,SignupActivity::class.java)
            intent.flags= Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()


        }

        binding.btnOnboardingSignin.setOnClickListener {
            val intent  = Intent(this,SignupActivity::class.java)
            intent.flags= Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        TabLayoutMediator(binding.tabLayout,binding.onboardingViewpager){tab,position ->

        }.attach()
    }


}