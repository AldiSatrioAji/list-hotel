package com.example.chopper.rxwithretrofitandgroupie.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.chopper.rxwithretrofitandgroupie.R
import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import com.example.chopper.rxwithretrofitandgroupie.util.toGone
import com.example.chopper.rxwithretrofitandgroupie.util.toVisible
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : UserView, AppCompatActivity() {

    @Inject
    lateinit var userPresenter: UserPresenter

    private var group = GroupAdapter<ViewHolder>()
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)

        setupRv()

        userPresenter.fetchData()
        userPresenter.attachView(this)
    }

    fun setupRv() {
        rvMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = group
        }
    }

    override fun fetchDataResult(baseResponse: BaseResponse) {
        val listUser = ArrayList(baseResponse.data)
        baseResponse.data.map {
            userAdapter = UserAdapter(it)
            group.add(userAdapter)
        }
    }

    override fun showLoading() {
        pbBar.toVisible()
    }

    override fun hideLoading() {
        pbBar.toGone()
    }

    override fun onDestroy() {
        super.onDestroy()
        userPresenter.detachView()
    }

}
