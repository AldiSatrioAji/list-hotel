package com.example.chopper.rxwithretrofitandgroupie.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.chopper.rxwithretrofitandgroupie.BaseInjectedActivity
import com.example.chopper.rxwithretrofitandgroupie.R
import com.example.chopper.rxwithretrofitandgroupie.di.RetrofitComponent
import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import com.example.chopper.rxwithretrofitandgroupie.util.toGone
import com.example.chopper.rxwithretrofitandgroupie.util.toVisible
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : UserView, BaseInjectedActivity() {

    @Inject
    lateinit var userPresenter: UserPresenter

    var group = GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userPresenter.fetchData()
        setupRv()
    }

    override fun inject(appComponent: RetrofitComponent) {
        appComponent.inject(this)
    }

    fun setupRv() {
        rvMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = group
        }
    }

    override fun fetchDataResult(baseResponse: BaseResponse) {
        group.add(UserItem(baseResponse))
    }

    override fun showLoading() {
        pbBar.toVisible()
    }

    override fun hideLoading() {
        pbBar.toGone()
    }

}
