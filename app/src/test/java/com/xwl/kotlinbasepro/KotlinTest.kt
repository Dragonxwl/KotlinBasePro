package com.xwl.kotlinbasepro

class KotlinTest(var aa: Int) {
    init {
        println("创建KotlinTest对象" + aa)
    }
    // 函数定义使用关键字 fun，参数格式为：参数 : 类型
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // 表达式作为函数体，返回类型自动推断：
    public fun sum1(a: Int, b: Int): Int = a + b + aa

    // public 方法则必须明确写出返回类型  ??
    public fun sum2(a: Int, b: String): String = b + a
}