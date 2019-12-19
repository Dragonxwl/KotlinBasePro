package com.xwl.kotlinbasepro.onclick

import android.os.Bundle
import android.view.View
import com.xwl.kotlinbasepro.R
import com.xwl.kotlinbasepro.base.BaseActivity

class ThirdOnclickActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_onclick_activiy_layout)
    }

    fun onClickOne(v: View?) {
        println("点击事件1 触发")
        println("点击事件1 方法1")
        println("点击事件1 方法2")
    }

    fun onClickTwo(v: View?) {
        println("点击事件2 触发")
        println("点击事件2 方法1")
        println("点击事件2 方法2")
    }

    fun onClickThree(v: View?) {
        println("点击事件3 触发")
        println("点击事件3 方法1")
        println("点击事件3 方法2")
    }

}