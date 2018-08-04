package com.example.chopper.rxwithretrofitandgroupie.di

import com.example.chopper.rxwithretrofitandgroupie.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    internal abstract fun bindMainActivity(): MainActivity

}