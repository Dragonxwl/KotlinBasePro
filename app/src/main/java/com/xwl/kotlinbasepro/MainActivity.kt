package com.xwl.kotlinbasepro

import android.content.Intent
import android.os.Bundle
import com.xwl.kotlinbasepro.base.BaseActivity
import com.xwl.kotlinbasepro.onclick.FirstOnclickActivity
import com.xwl.kotlinbasepro.onclick.SecondOnclickActivity
import com.xwl.kotlinbasepro.onclick.ThirdOnclickActivity
import com.xwl.kotlinbasepro.startActivity.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("XWL_MainActivity")
        init()
    }

    private fun init() {
        println("XWL_MainActivity  init")
        TextView_one.text="跳转1"
        TextView_one.setOnClickListener{
            println("XWL_MainActivity  -->  XWL_SecondActivity")
            startActivity(Intent(this,SecondActivity::class.java))
        }
        TextView_two.setOnClickListener{
            startActivity(Intent(this,FirstOnclickActivity::class.java))
        }
        TextView_three.setOnClickListener{
            startActivity(Intent(this,SecondOnclickActivity::class.java))
        }
        TextView_four.setOnClickListener{
            startActivity(Intent(this,ThirdOnclickActivity::class.java))
        }
    }
}
