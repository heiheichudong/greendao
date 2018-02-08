package com.greendao.entity

import org.greenrobot.greendao.annotation.Entity
import org.greenrobot.greendao.annotation.Id

/**
 * @author zl
 * @data 2018/2/8
 */
@Entity
class Person {
    @Id(autoincrement = true)
    var id:Long = 0
    var name:String = ""
    var age:Int = 0
    var frient: List<Person>? = null
}