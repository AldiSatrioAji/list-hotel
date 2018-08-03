package com.example.chopper.rxwithretrofitandgroupie

import io.reactivex.disposables.CompositeDisposable

open class BasePresenter<T : BaseView> : Presenter<T> {

    var userView: T? = null
    var compositeDisposable: CompositeDisposable

    init {
        compositeDisposable = CompositeDisposable()
    }

    override fun attachView(t: T) {
        userView = t
    }

    override fun detachView() {
        userView = null
        compositeDisposable.dispose()
    }

}