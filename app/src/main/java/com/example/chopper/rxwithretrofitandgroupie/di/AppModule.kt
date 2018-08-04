package com.example.chopper.rxwithretrofitandgroupie.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesContext(application: Application) : Context = application


}