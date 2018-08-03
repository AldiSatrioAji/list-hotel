package com.example.chopper.rxwithretrofitandgroupie.ui

import com.example.chopper.rxwithretrofitandgroupie.BaseView

interface UserView : BaseView {
    fun showLoading()
    fun removeLoading()
}