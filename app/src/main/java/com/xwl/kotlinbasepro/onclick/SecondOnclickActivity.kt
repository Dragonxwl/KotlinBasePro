package com.xwl.kotlinbasepro.onclick

import android.os.Bundle
import com.xwl.kotlinbasepro.R
import com.xwl.kotlinbasepro.base.BaseActivity
import kotlinx.android.synthetic.main.second_onclick_activiy_layout.*

class SecondOnclickActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_onclick_activiy_layout)
        init()
    }

    private fun init() {
        TextView_one.setOnClickListener {
            println("点击事件1 触发")
            println("点击事件1 方法1")
            println("点击事件1 方法2")
        }
        TextView_two.setOnClickListener {
            println("点击事件2 触发")
            println("点击事件2 方法1")
            println("点击事件2 方法2")
        }
        TextView_three.setOnClickListener {
            println("点击事件3 触发")
            println("点击事件3 方法1")
            println("点击事件3 方法2")
        }
    }

}