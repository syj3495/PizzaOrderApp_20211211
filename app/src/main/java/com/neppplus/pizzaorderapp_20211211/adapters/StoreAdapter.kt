package com.neppplus.pizzaorderapp_20211211.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.pizzaorderapp_20211211.datas.StoreData

class StoreAdapter(
    val mContext : Context
    val redID: Int,
    val mList : ArrayList<StoreData>



):ArrayAdapter<StoreData>(mContext,redID,mList) {


}