package com.example.chopper.rxwithretrofitandgroupie

interface Presenter<in T : BaseView> {
    fun attachView(t: T)
    fun detachView(t: T)
}
