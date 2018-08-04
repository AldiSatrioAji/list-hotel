package com.example.chopper.rxwithretrofitandgroupie.di

import android.app.Application
import com.example.chopper.rxwithretrofitandgroupie.BaseApp
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, AndroidSupportInjectionModule::class, ActivityBuilder::class))
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application) : Builder
        fun build() : AppComponent
    }

    fun inject(baseApp: BaseApp)
}