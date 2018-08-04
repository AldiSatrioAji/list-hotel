package com.example.chopper.rxwithretrofitandgroupie.network

import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NetworkService {

    @GET("v1/city")
    fun getUsersList() : Single<BaseResponse>

}