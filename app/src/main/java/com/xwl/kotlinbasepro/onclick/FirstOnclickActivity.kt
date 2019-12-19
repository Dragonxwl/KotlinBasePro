package com.xwl.kotlinbasepro.onclick

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.xwl.kotlinbasepro.R
import com.xwl.kotlinbasepro.base.BaseActivity
import kotlinx.android.synthetic.main.first_onclick_activiy_layout.*

class FirstOnclickActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_onclick_activiy_layout)
        findViewById<TextView>(R.id.TextView_one).text = "点击事件1 find"
    }

    override fun onClick(v: View?) {
        when (v) {
            TextView_one -> {
                print("点击事件1 触发")
                print("点击事件1 方法1")
                println("点击事件1 方法2")
            }
            TextView_two -> {
                println("点击事件2 触发")
                println("点击事件2 方法1")
                println("点击事件2 方法2")
            }
            TextView_three -> {
                println("点击事件3 触发")
                println("点击事件3 方法1")
                println("点击事件3 方法2")
            }
        }
    }
}