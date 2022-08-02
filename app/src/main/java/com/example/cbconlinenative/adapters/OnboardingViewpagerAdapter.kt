package com.example.cbconlinenative.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cbconlinenative.R

class OnboardingViewpagerAdapter(context: Context) :
    RecyclerView.Adapter<OnboardingViewpagerAdapter.ViewHolder>() {

    private val mContext = context

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(mContext)
                .inflate(R.layout.onboarding_viewpager_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}