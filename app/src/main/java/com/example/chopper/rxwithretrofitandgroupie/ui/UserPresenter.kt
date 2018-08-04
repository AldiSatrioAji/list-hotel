package com.example.chopper.rxwithretrofitandgroupie.ui

import android.util.Log
import com.example.chopper.rxwithretrofitandgroupie.BasePresenter
import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import com.example.chopper.rxwithretrofitandgroupie.repository.UserRepository
import com.example.chopper.rxwithretrofitandgroupie.repository.UserRepositoryImpl
import com.github.ajalt.timberkt.d
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class UserPresenter @Inject constructor(val userRepositoryImpl: UserRepositoryImpl) : BasePresenter<UserView>() {

    fun fetchData() {
        userRepositoryImpl.fetchData(object : UserRepository.FetchDataCallback {
            override fun onSuccess(baseResponse: BaseResponse) {
                userView?.hideLoading()
                userView?.fetchDataResult(baseResponse)
            }

            override fun onSubscribe(disposable: Disposable) {
                userView?.showLoading()
                compositeDisposable.add(disposable)
            }

            override fun onError(throwable: Throwable) {
                Log.d("TAG","result is error ${throwable.message}")
                userView?.hideLoading()
            }
        })
    }
}