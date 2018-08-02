package com.example.chopper.rxwithretrofitandgroupie

import android.app.Application
import com.example.chopper.rxwithretrofitandgroupie.di.DaggerRetrofitComponent

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        DaggerRetrofitComponent.builder().build().inject(this)
    }

}