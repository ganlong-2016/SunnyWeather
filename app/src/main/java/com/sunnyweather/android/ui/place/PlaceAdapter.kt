package com.sunnyweather.android.ui.place

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.sunnyweather.android.R
import com.sunnyweather.android.logic.model.Place

/**
 * <pre>
 *     author : ganlong
 *     time   : 2020/05/17
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class PlaceAdapter(data: MutableList<Place>? = null) :
    BaseQuickAdapter<Place, BaseViewHolder>(R.layout.place_item, data) {

    override fun convert(holder: BaseViewHolder, item: Place) {
        holder.setText(R.id.placeName, item.name)
        holder.setText(R.id.placeAddress, item.address)
    }
}