package com.example.utspemrogramanmobile

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val image: Int,
    val title: String
):Parcelable
