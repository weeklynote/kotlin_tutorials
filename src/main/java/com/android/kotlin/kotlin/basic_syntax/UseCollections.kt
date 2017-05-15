package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/15.
 */
fun collection(){
    val list = listOf("a", "b", "c")
    // 遍历集合
    for (item in list) {
        println(item)
    }
    // 判断集合中是否含有in操作符中的对象
    when {
        "orange" in list -> println("juicy")
        "apple" in list -> println("apple is fine too")
    }
    // 使用lambda表达式过滤和map操作
    list.filter{it.startsWith("a")}.sortedBy{it}.map{it.toUpperCase()}
    .forEach{print(it)}
}
