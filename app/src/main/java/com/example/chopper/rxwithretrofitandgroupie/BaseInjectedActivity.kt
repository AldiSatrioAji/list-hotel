package com.example.chopper.rxwithretrofitandgroupie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.chopper.rxwithretrofitandgroupie.di.RetrofitComponent

abstract class BaseInjectedActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appComponent = BaseApp.get(this)
                .appComponent

        inject(appComponent)
    }

    abstract fun inject(appComponent: RetrofitComponent)

}