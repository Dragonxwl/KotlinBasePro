package com.xwl.kotlinbasepro.startActivity

import android.content.Intent
import android.os.Bundle
import com.xwl.kotlinbasepro.base.BaseActivity

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("XWL_SecondActivity")
        println("XWL_SecondActivity  -->  XWL_ThirdActivity")
        startActivityForResult(Intent(this,
            ThirdActivity::class.java),
            1001)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1001) {
            println("XWL_ThirdActivity  -->  XWL_SecondActivity")
        }
    }
}