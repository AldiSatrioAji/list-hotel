package com.example.chopper.rxwithretrofitandgroupie.ui

import com.example.chopper.rxwithretrofitandgroupie.R
import com.example.chopper.rxwithretrofitandgroupie.model.Data
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.list.view.*

class UserAdapter(val baseResponse: Data) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.list

    override fun bind(viewHolder: ViewHolder, position: Int) {
        Picasso.get()
                .load(baseResponse.background)
                .into(viewHolder.itemView.ivBackground)

        viewHolder.itemView.tvName.text = baseResponse.name
        viewHolder.itemView.tvId.text = baseResponse.description
    }

}