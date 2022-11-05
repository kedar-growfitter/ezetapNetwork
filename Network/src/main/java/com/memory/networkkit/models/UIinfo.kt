package com.memory.networkkit.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UIinfo (
    @SerializedName("logo-url")
    val logoUrl : String,
    @SerializedName("heading-text")
    val headingtext : String,
    val uidata : List<UIElements>
) : Serializable