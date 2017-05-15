package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/15.
 */

fun iter1(){
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

fun iter2(){
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}
