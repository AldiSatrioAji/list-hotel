package com.example.chopper.rxwithretrofitandgroupie.di

import android.app.Application
import android.content.Context
import com.example.chopper.rxwithretrofitandgroupie.network.NetworkService
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesContext(application: Application) : Context = application


    @Singleton
    @Provides
    fun providesInstance(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://randomuser.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    @Singleton
    @Provides
    fun providesCall(retrofit: Retrofit): NetworkService {
        return retrofit.create(NetworkService::class.java)
    }

}