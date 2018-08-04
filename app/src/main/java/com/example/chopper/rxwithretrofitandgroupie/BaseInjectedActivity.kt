package com.example.chopper.rxwithretrofitandgroupie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.chopper.rxwithretrofitandgroupie.di.DaggerRetrofitComponent
import com.example.chopper.rxwithretrofitandgroupie.di.RetrofitComponent
import com.example.chopper.rxwithretrofitandgroupie.di.RetrofitModule

abstract class BaseInjectedActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appComponent = DaggerRetrofitComponent.builder().retrofitModule(RetrofitModule()).build()

        inject(appComponent)
    }

    abstract fun inject(appComponent: RetrofitComponent)

}