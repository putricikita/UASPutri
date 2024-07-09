package com.example.uasputri.service

import com.example.uasputri.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=fabe3ced20c9a89ec53de629139ce5c8")
    fun getTVList(): Call<TelevisionResponse>

}