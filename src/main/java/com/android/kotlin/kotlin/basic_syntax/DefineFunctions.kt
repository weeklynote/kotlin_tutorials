package com.android.kotlin.kotlin.basic_syntax

import java.util.*
import java.util.concurrent.locks.Lock

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
 * 使用高阶函数会有运行时的开销：每个函数都是一个对象，并且函数会持有一个闭包。比如函数方法体中的访问变量。
 * 内存分配(函数和类的内存分配)和虚拟调用导致运行时开销。
 * 在大多数情况下，这种开销都是可以通过inline lambda表达式消除影响，如下例所示：
 */
// fun lock(l) { sum( 1, 5) }
// 替代方案
// l.lock()
// try {
//    foo()
// }
// finally {
//    l.unlock()
// }
/**
 * 要让编译器按照上面的例子工作，只需要在lock()方法前加上inline修饰符。
 */
inline fun <T> lock(lock: Lock, body: () -> T): Unit {}
/**
 * inline修饰符影响函数和传入的lambda表达式，它们都会被嵌入到调用位置。
 * inline会导致生成的代码量增加，但是如果以合理的方式(不要inline打得功能函数)使用，
 * 将会增加性能，特别是循环中。
 */
/**
 *  noinline函数
 *  如果想让指定的lambda表达式inline，另一些不inline，可以使用noinline表达式
 */
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {}
/**
 * 使用时需要注意，如果一个inline函数有一个noinline参数函数和具体化的类型参数，编译器会产生一个警告，因为在这种情况下
 * 极有可能达不到inline的效果。
 */
/**
 * Kotlin中，我们可以使用return直接退出函数调用，但是退出lambda表达式，我们需要使用一个标签，并且一个单独的return是禁止的，因为
 * lambda不能让闭包函数返回。
 */
// fun foo() {
//     ordinaryFunction {
//         return // 不能这样直接返回，会报错
//     }
// }
/**
 * 如果传入的lambda表达式是inline的，return也会被inline，所以以下方式是允许的。
 */
// fun foo() {
//     inlineFunction {
//         return // lambda表达式是inline的是允许这么使用的
//     }
// }
/**
 * 以上的这种return方式被称为non-local returns。
 * inline函数在调用lambda表达式时可能将其作为参数而不是直接调用，而是从另外的上下文环境执行，比如本地变量或嵌套函数。
 * 在这种情况下，non-local returns是不被允许的。另外需要注意lambda参数需要使用crossinline标记。
 */
inline fun f(crossinline body: () -> Unit) {
    val f = Runnable { body() }
}
/**
 * break和continue现在还不支持，正在计划中。
 */

/** Reified type parameters  */
/**
 * 有时候我们需要访问传递给我们的参数类型
 */
//fun <T> findParentOfType(clazz: Class<T>): T? {
//    var p = parent
//    while (p != null && !clazz.isInstance(p)) {
//        p = p?.parent
//    }
//    @Suppress("UNCHECKED_CAST")
//    return p as T
//}
/**
 * 上面的函数检查参数是否是特定的类型，虽然能使用，但是调用不优雅。
 */
// findParentOfType(MyTreeNodeType::class.java)
/**
 * 我们想要的仅仅是传递一个类型给函数，如下：
 */
/// findParentOfType<MyTreeNodeType>()
/**
 * 使用reified关键字可以实现这个需求。
 */
//inline fun <reified T> findParentOfType(): T? {
//    var p = parent
//    while (p != null && p !is T) {
//        p = p?.parent
//    }
//    return p as T
//}
/**
 * 使用reified修饰符限制参数类型，被修饰的参数类型可以在函数内部使用，就像它是一个正常的类。因为函数时inline的，
 * 就不需要反射了，取而代之是使用!is和as。
 * 普通函数(没有标记为inline)不能使用reified参数，不能再运行时保留的类型不能作为reified参数。
 */
/** inline属性
 * inline修饰符可以用在属性存储器上(没有支持字段)，你可以标记一个单独的属性存储器。
 */
//val foo: Foo
//    inline get() = Foo()
//var bar: Bar
//    get() = ...
//inline set(v) { ... }
/**
 * 可以标记所有的属性，让其标记为inline
 */
//inline var bar: Bar
//    get() = ...
//set(v) { ... }




























