package com.example.chopper.rxwithretrofitandgroupie.ui

import com.example.chopper.rxwithretrofitandgroupie.R
import com.example.chopper.rxwithretrofitandgroupie.model.BaseResponse
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.list.view.*

class UserItem(val baseResponse: BaseResponse) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.list

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tvName.text = baseResponse.name.first
    }

}