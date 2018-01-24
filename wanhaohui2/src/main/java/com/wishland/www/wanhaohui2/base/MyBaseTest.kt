package com.wishland.www.wanhaohui2.base

/**
 * Created by admin on 2017/11/3.
 */
class MyActivity : BaseStyleActivity() {
    private val items = listOf("apple", "banana", "kiwi")

    override fun initVariable() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val a = 3
        items.forEach { print(it) }
        items.forEachIndexed { index, s -> items[index] }
        for (index in items.indices) {
            print(items[index])
        }
    }

    override fun initDate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val b = 4
        maxOf(1, 4)
    }

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val c = 4

    }

    fun maxOf(a: Int, b: Int) = if (a > b) a else b


}