package com.memory.networkkit.interfaces

import com.memory.networkkit.models.UIinfo
import retrofit2.Response
import retrofit2.http.GET

interface Network {
    @GET("/mobileapps/android_assignment.json")
    suspend fun fetchCustomUI() : Response<UIinfo>

    fun fetchImage()
}