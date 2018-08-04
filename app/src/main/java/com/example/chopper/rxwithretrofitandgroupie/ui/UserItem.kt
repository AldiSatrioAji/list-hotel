package com.example.chopper.rxwithretrofitandgroupie.ui

import android.util.Log
import com.example.chopper.rxwithretrofitandgroupie.R
import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import com.github.ajalt.timberkt.d
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list.view.*

class UserItem(val baseResponse: BaseResponse) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.list

    override fun bind(viewHolder: ViewHolder, position: Int) {
        d { "viewHolder ${baseResponse.results.size}" }
        viewHolder.itemView.tvName.text = baseResponse.results.get(position).name.title
    }

}