package com.example.chopper.rxwithretrofitandgroupie.repository

import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import com.example.chopper.rxwithretrofitandgroupie.network.NetworkService
import com.github.ajalt.timberkt.Timber.d
import io.reactivex.Single
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor (val networkService: NetworkService) : UserRepository{

    override fun fetchData(fetchDataCallback: UserRepository.FetchDataCallback) {
        return networkService.getUsersList(10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : SingleObserver<BaseResponse> {
                    override fun onSuccess(t: BaseResponse) {
                        fetchDataCallback.onSuccess(t)
                    }

                    override fun onSubscribe(d: Disposable) {
                        fetchDataCallback.onSubscribe(d)
                    }

                    override fun onError(e: Throwable) {
                        fetchDataCallback.onError(e)
                    }
                })
    }
}