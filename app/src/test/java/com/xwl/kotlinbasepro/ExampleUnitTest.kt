package com.xwl.kotlinbasepro


import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val kotlin = KotlinTest(1)
        print(kotlin.sum(1,3))
        print(kotlin.sum1(1,3))
        print(kotlin.sum2(3,"aaaa"))
    }
}
