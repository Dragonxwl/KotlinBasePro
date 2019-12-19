package com.xwl.kotlinbasepro.base

class kotlinBase {
    // 函数定义使用关键字 fun，参数格式为：参数 : 类型
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    // 表达式作为函数体，返回类型自动推断：
    fun sum1(a: Int,b:Int) = a + b
    // public 方法则必须明确写出返回类型  ??
    public fun sum2(a:Int ,b:String):String = b + a

    companion object {
        fun main(args: Array<String>) {
            sum2(3, "aaa")
        }

        public fun sum2(a:Int ,b:String) = b + a
    }
}