package com.animusabhi.locationapi.data.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class Data(
    @SerializedName("autoCompleteRequestString")
    @Expose
    val autoCompleteRequestString: String? = null,

    @SerializedName("addressList")
    @Expose
    val addressList: List<AddressList>? = null
)