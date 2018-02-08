package com.greendao

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.greendao.entity.Student
import com.greendao.entity.Teacher
import com.greentest.TestKotlin
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        startActivity(Intent(this@MainActivity,DataActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
        Toast.makeText(this, testCall(),Toast.LENGTH_LONG).show()
        var model = TestKotlin()
        model.testKotlin(this)

        sample_text.setOnClickListener(this)

        setData()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    fun setData(){
        var sDao = DbManager.getInstance().getSession(this@MainActivity)
        for (i in 1..10){
            var student = Student()
            if (i % 3 == 0){
                var teacher = Teacher()
                teacher.teacherId = i / 3L
                student.teacherId = i / 3L
            }else {
                student.teacherId = i / 3L
            }
            student.age = 8;
            student.name = "第 "+ i +"个学生"
            sDao.insert(student)
        }
    }
}
