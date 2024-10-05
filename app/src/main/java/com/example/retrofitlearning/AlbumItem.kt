package com.example.retrofitlearning

import com.google.gson.annotations.SerializedName

data class AlbumItem(
    @SerializedName("id")
    val id : Int,
    @SerializedName("userId")
    val userId : Int,
    @SerializedName("title")
    val titled : String
)