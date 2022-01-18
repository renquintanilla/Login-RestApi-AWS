package com.example.loginapp

import com.google.gson.annotations.SerializedName

data class UserResponses (
    @SerializedName("status") var status: String,
    @SerializedName("message") var message: String


)