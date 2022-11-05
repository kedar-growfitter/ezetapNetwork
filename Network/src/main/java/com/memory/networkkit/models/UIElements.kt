package com.memory.networkkit.models

import java.io.Serializable

data class UIElements (
    val uitype: String,
    val value: String,
    val key: String,
    val hint: String,
): Serializable