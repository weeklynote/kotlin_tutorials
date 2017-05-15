package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/15.
 */
fun maxOf(a : Int, b : Int) : Int{
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxOf_(a : Int, b : Int) = if(a > b) a else b
