package com.greendao

import android.content.Context
import com.example.greendao.DaoMaster
import com.example.greendao.DaoSession

/**
 * @author zl
 * @data 2018/2/8
 */
class DbManager private constructor(){
    companion object {
        fun getInstance():DbManager{
            return instance.instance;
        }
    }

    private object instance{
        val instance = DbManager()
    }

    fun getSession(context: Context):DaoSession{
        var helper = DaoMaster.DevOpenHelper(context,"green-db",null)
        var daoMaster = DaoMaster(helper.writableDatabase)
        var daoSession = daoMaster.newSession()
        return daoSession;
    }
}