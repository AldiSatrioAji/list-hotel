package com.example.chopper.rxwithretrofitandgroupie.model

data class BaseResponse(
        val data: List<Data>,
        val message: String,
        val status: Int
)