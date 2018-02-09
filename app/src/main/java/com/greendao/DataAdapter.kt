package com.greendao

import android.support.v7.widget.RecyclerView
import cn.bingoogolapple.baseadapter.BGARecyclerViewAdapter
import cn.bingoogolapple.baseadapter.BGAViewHolderHelper
import com.greendao.entity.Student

/**
 * Created by bmnp on 2018/2/9.
 */
class DataAdapter(recyclerView: RecyclerView?) : BGARecyclerViewAdapter<Student>(recyclerView, android.R.layout.simple_list_item_2) {

    override fun fillData(helper: BGAViewHolderHelper?, position: Int, model: Student?) {
        helper?.getTextView(android.R.id.text1)?.setText(model?.name)
        helper?.getTextView(android.R.id.text2)?.setText(model?.teacherId.toString())
    }
}