package com.android.kotlin.kotlin.basic_syntax

import java.util.*

/**
 * Created by android on 2017/5/12.
 * Gettting Started
 *      ----Basic Syntax
 *           ----Defining functions
 */
fun sum(a : Int, b : Int) : Int{
    return a + b;
}
/**
 * 如果一个函数只包含一个表达式，而且他的返回值是可推断的。
 */
fun sum_(a : Int, b : Int) = a + b
/**
 * 函数返回无意义的值，使用关键字Unit
 */
fun printMsg(a : Int, b : Int) : Unit{
    println("msg of $a and $b is ${a + b}")
}
/**
 * Unit关键字可以取消
 */
fun printMsg_(a : Int, b : Int) : Unit{
    println("msg of $a and $b is ${a + b}")
}
/**
 * 函数如果存在方法体，及多个表达式时，必须显示的指定返回类型。当然如果返回的Unit时也可以不指定。
 */
/**
 * 函数的最后一个参数可以使用vararg，用于传递可变个数的参数。
 * 以下函数为例，参数类型T会被作为数组。
 * 只能有一个参数可以被标记为vararg。
 */
fun <T> asList(vararg ts : T) : List<T>{
    var result = ArrayList<T>();
    for(t in ts){
        result.add(t)
    }
    return result
}
// var list = asList(1, 2, 3, 4)

// var a = arrayOf(1, 2, 3)
// var list = asList(4, 5, *a, 6)
/**
 * 在调用可变参数函数时，可以一个一个的传递参数或者在数组前加*，如上所示。
 */
/**
 * Kotlin的函数可以直接在源文件定义，而不是像Java、C#、Scala那样需要在类包含函数。
 */

/**
 * 局部函数
 */
//fun dfs(graph: Graph) {
//    fun dfs(current: Vertex, visited: Set<Vertex>) {
//        if (!visited.add(current)) return
//        for (v in current.neighbors)
//            dfs(v, visited)
//    }
//    dfs(graph.vertices[0], HashSet())
/**
 * visited参数可以作为局部变量。
 */
//}
//fun dfs(graph: Graph) {
//    val visited = HashSet<Vertex>()
//    fun dfs(current: Vertex) {
//        if (!visited.add(current)) return
//        for (v in current.neighbors)
//            dfs(v)
//    }
//    dfs(graph.vertices[0])
//}
/**
 * 成员函数，即定义在类内部的函数
 */
class Sample(){
    fun foo(){
        println("Foo")
    }
}
// Sample().foo() 创建Sample实例并调用foo方法。
/**
 * 泛型函数
 */
fun <T> singletonList(item : T) : List<T>{
    var result = ArrayList<T>();
    return result
}
/**
 * 内联函数
 */
































