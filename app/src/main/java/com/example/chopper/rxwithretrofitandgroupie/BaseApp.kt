package com.example.chopper.rxwithretrofitandgroupie

import android.app.Application
import android.content.Context
import com.example.chopper.rxwithretrofitandgroupie.di.DaggerRetrofitComponent
import com.example.chopper.rxwithretrofitandgroupie.di.RetrofitModule

class BaseApp : Application() {

    companion object {
        fun get(context: Context) : BaseApp = context.applicationContext as BaseApp
    }

    val appComponent by lazy {
        DaggerRetrofitComponent.builder().retrofitModule(RetrofitModule()).build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}