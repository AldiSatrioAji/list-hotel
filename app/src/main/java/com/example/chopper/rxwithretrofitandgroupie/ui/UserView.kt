package com.example.chopper.rxwithretrofitandgroupie.ui

import com.example.chopper.rxwithretrofitandgroupie.BaseView
import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse

interface UserView : BaseView {
    fun fetchDataResult(baseResponse: BaseResponse)
}