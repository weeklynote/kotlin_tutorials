package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/15.
 */
/**
 * is操作符检查对象是否是类型的实例。
 * 如果不可变的本地变量或属性是某种类型的实例，那么不需要显示的转化到该类型
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
    // `obj` 会被自动转化为String
        return obj.length
    }
    // `obj` 类型保持不变
    return null
}
fun getStringLength_(obj: Any): Int? {
    if (obj !is String) return null
    // `obj` 会被自动转化为String
    return obj.length
}
