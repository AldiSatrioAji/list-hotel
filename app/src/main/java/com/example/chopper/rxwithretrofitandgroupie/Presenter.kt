package com.example.chopper.rxwithretrofitandgroupie

interface Presenter<T : BaseView> {
    fun attachView(t: T)
    fun detachView()
}
