package com.example.chopper.rxwithretrofitandgroupie.ui

import com.example.chopper.rxwithretrofitandgroupie.BasePresenter
import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import com.example.chopper.rxwithretrofitandgroupie.repository.UserRepository
import com.example.chopper.rxwithretrofitandgroupie.repository.UserRepositoryImpl
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class UserPresenter @Inject constructor(val userRepositoryImpl: UserRepositoryImpl, val userView: UserView) : BasePresenter<UserView>() {

    fun fetchData() {
        userRepositoryImpl.fetchData(object : UserRepository.FetchDataCallback {
            override fun onSuccess(baseResponse: BaseResponse) {
                userView.removeLoading()
            }

            override fun onSubscribe(disposable: Disposable) {
                userView.showLoading()
            }

            override fun onError(throwable: Throwable) {
                userView.removeLoading()
            }
        })
    }
}