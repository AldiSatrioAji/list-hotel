package com.example.chopper.rxwithretrofitandgroupie.network

import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("api/")
    fun getUsersList(@Query("results")numOfUser: Int) : Single<BaseResponse>

}