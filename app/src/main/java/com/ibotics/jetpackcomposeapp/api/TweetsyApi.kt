package com.ibotics.jetpackcomposeapp.api

import com.ibotics.jetpackcomposeapp.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyApi {

    @GET("/v3/b/64c7e95f9d312622a38992a2?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<TweetListItem>>

    @GET("/v3/b/64c7e95f9d312622a38992a2?meta=false")
    @Headers("X-JSON-Path:tweets..category")
    suspend fun getCategory():Response<List<String>>
}