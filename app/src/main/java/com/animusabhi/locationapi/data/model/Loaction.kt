package com.animusabhi.locationapi.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("requestId")
    @Expose
    val requestId: String,
    @SerializedName("data")
    @Expose
    val data: Data
)