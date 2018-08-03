package com.example.chopper.rxwithretrofitandgroupie.repository

import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import io.reactivex.disposables.Disposable

interface UserRepository {

    fun fetchData(fetchDataCallback: FetchDataCallback)

    interface FetchDataCallback {
        fun onSuccess(baseResponse: BaseResponse)
        fun onSubscribe(disposable: Disposable)
        fun onError(throwable: Throwable)
    }

}