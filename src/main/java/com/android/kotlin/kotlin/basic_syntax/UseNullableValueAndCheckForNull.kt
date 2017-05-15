package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/15.
 */
/**
 * 如果一个引用有可能是null，那么必须显示的指明。
 */
fun parseInt(str: String): Int? {
   if(str == "1"){
       return null
   }
    return 3
}
/**
 * Safe Calls
 */
fun len(){
    var str : String = "----"
    str?.length
}

/**
 * 如果str不为null，则返回str.length;否则返回null。表达式的类型为Int？
 * 安全调用在链式调用时非常有用，如果任意一个环节为null，都会返回null。
 * 要在非null值上进行操作，可以使用let
 */
class Test11{
    fun listwithNull() : Unit{
        val listWithNullss: List<String?> = listOf("A", null)
        for (item in listWithNullss) {
            item?.let { println(it) } // 输出A并且忽略null
        }
    }
}
