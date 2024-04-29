package com.example.wishyouwerehere

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location (
    val name: String,
    val location: String,
    val date: String,
    val description: String,
    val imageName: String,
    val rating: Int
) : Parcelable