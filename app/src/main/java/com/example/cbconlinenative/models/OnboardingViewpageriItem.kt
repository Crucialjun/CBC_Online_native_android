package com.example.cbconlinenative.models

import kotlinx.serialization.Serializable

@Serializable
data class OnboardingViewpageriItem(
    val title : String,
    val description : String,
    val assetName : String
)
