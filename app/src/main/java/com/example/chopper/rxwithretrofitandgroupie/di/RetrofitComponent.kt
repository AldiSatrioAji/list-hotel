package com.example.chopper.rxwithretrofitandgroupie.di

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(RetrofitModule::class))
interface RetrofitComponent {
    fun inject(application: Application)
}