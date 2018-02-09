package com.greendao

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import cn.bingoogolapple.baseadapter.BGAAdapterViewAdapter
import cn.bingoogolapple.baseadapter.BGARecyclerViewAdapter
import com.greendao.entity.Student
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        rv_db_data.layoutManager = LinearLayoutManager(this@DataActivity);
        var mAdapter = DataAdapter(rv_db_data)
        rv_db_data.adapter = mAdapter;
        var ss = DbManager.getInstance().getSession(this@DataActivity).studentDao.queryBuilder().list()
//        var ts = DbManager.getInstance().getSession(this@DataActivity).teacherDao.queryBuilder().where()
        mAdapter.addMoreData(ss)
    }
}
