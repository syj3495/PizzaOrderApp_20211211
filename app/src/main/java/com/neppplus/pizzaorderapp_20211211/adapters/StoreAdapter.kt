package com.neppplus.pizzaorderapp_20211211.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.pizzaorderapp_20211211.R
import com.neppplus.pizzaorderapp_20211211.datas.StoreData
import kotlin.math.min

class StoreAdapter(
    val mContext : Context,
    val redID: Int,
    val mList : ArrayList<StoreData>

):ArrayAdapter<StoreData>(mContext,redID,mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null){

            tempRow = mInflater.inflate( R.layout.store_list_item, null )

        }

        val row = tempRow!!

        return row

    }

}