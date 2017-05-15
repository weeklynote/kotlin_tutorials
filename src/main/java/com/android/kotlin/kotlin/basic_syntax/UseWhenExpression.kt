package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/15.
 */
fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
/**
 * when语句会串行的匹配条件直到找到匹配项，else分支会在未被匹配到时执行。
 * 如果when使用的是表达式，那么else也必须使用表达式。
 * 如果有很多条件下的处理相同，可以使用逗号将条件分开。
 */
fun multipConditions(x : Int){
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }
}
/**
 * 可以使用任意的表达式作为分支条件
 */
fun arbitary(x : Int, s : String){
    when (x) {
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }
}
/**
 * 也可以使用in和!in检查一个范围
 */
fun rangeCheck(x : Int){
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}
/**
 * 另一个场景就是is和!is判断，同理，如果是某种类型将会被自动转化，因此可以直接访问特定对象的属性和方法。
 */
fun bool(x : Any) : Boolean{
    val hasPrefix = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }
    return hasPrefix
}
/**
 * when可以用来替代if-else-if语句。如果when没有参数，那么when语句的分支条件就是简单的boolean计算，并且在条件为true时，分支会被执行
 */
fun whenNoArg(x : String){
    when {
        x.startsWith("ax") -> print("x is odd")
        x.startsWith("bx") -> print("x is even")
        else -> print("x is funny")
    }
}