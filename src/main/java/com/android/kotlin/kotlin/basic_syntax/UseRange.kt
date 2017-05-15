package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/15.
 */
/**
 * 使用in操作符判断一个数字是否在某个范围
 */
fun checkInRange(){
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}
/**
 * 使用!in操作符判断一个数字是否在某个范围
 */
fun checkOutRange(){
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
}
/**
 * 遍历范围
 */
fun iterRange(){
    for (x in 1..5) {
        print(x)
    }
}
/**
 * 按照一定的进度遍历
 */
fun iterWithProgression(){
    for (x in 1..10 step 2) {
        print(x)
    }
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}