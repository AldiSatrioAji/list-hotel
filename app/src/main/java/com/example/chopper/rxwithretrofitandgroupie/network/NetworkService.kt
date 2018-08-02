package com.example.chopper.rxwithretrofitandgroupie.network

import io.reactivex.Single

interface NetworkService {

    fun getUsersList() : Single<>

}