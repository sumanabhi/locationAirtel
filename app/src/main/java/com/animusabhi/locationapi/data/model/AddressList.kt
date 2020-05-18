package com.animusabhi.locationapi.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AddressList(
    @SerializedName("id")
    @Expose
    val id: String = "",
    @SerializedName("city")
    @Expose
    val city: String = "",
    @SerializedName("addressString")
    @Expose
    val addressString: String = "",
    @SerializedName("latitude")
    @Expose
    val latitude: Double = 0.0,
    @SerializedName("longitude")
    @Expose
    val longitude: Double = 0.0,
    @SerializedName("label")
    @Expose
    val label: String = "",
    @SerializedName("pinCode")
    @Expose
    val pinCode: String = ""
)