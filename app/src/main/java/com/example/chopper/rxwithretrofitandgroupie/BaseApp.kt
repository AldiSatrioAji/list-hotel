package com.example.chopper.rxwithretrofitandgroupie

import android.app.Application
import com.example.chopper.rxwithretrofitandgroupie.di.DaggerRetrofitComponent
import com.example.chopper.rxwithretrofitandgroupie.di.RetrofitModule
import com.github.ajalt.timberkt.Timber

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}