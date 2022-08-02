package com.example.cbconlinenative.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cbconlinenative.R
import com.example.cbconlinenative.databinding.OnboardingViewpagerLayoutBinding
import com.example.cbconlinenative.models.OnboardingViewpageriItem
import com.google.gson.GsonBuilder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement

class OnboardingViewpagerAdapter(context: Context) :
    RecyclerView.Adapter<OnboardingViewpagerAdapter.ViewHolder>() {

    private val mContext = context

    val gson = GsonBuilder().create()
    val listofItems = gson.fromJson(mContext.assets.open("onboarding_items.json").toString(), Array<OnboardingViewpageriItem>::class.java).toList()



    inner class ViewHolder(private val binding :OnboardingViewpagerLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(onboardingItems: OnboardingViewpageriItem) {
            with(binding) {
                viewpagerTitle.text = onboardingItems.title
                viewpagerDescription.text = onboardingItems.description
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = OnboardingViewpagerLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(
           view
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listofItems[position])


    }

    override fun getItemCount(): Int {
        return listofItems.size
    }
}