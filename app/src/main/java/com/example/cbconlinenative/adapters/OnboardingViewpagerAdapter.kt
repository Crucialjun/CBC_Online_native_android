package com.example.cbconlinenative.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cbconlinenative.R
import com.example.cbconlinenative.databinding.OnboardingViewpagerLayoutBinding
import com.example.cbconlinenative.models.OnboardingViewpageriItem
import com.example.cbconlinenative.utils.getJsonDataFromAsset
import com.google.gson.GsonBuilder


class OnboardingViewpagerAdapter(context: Context) :
    RecyclerView.Adapter<OnboardingViewpagerAdapter.ViewHolder>() {

    val mContext = context

    val itemsJson = getJsonDataFromAsset(mContext,"onboarding_items.json")
    val gson = GsonBuilder().create()
    private val listofItems: List<OnboardingViewpageriItem> =
        gson.fromJson(
        itemsJson,
        Array<OnboardingViewpageriItem>::class.java
    ).toList()


    inner class ViewHolder(private val binding: OnboardingViewpagerLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(onboardingItems: OnboardingViewpageriItem) {
            with(binding) {
                viewpagerTitle.text = onboardingItems.title
                viewpagerDescription.text = onboardingItems.description
                viewpagerImage.apply {
                    val imageName = onboardingItems.imageUrl
                    val id = resources.getIdentifier(imageName,"drawable",mContext.packageName)
                    setBackgroundResource(id)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = OnboardingViewpagerLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

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