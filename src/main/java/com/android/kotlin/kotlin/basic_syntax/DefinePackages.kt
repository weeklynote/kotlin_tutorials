package com.android.kotlin.kotlin.basic_syntax

/**
 * Created by android on 2017/5/12.
 * 内容对应kotlin-docs.pdf
 * Gettting Started
 *      ----Basic Syntax
 *           ----Defining packages
 * 包名必须定义在源文件的最开始位置。如果没有指定包，那么源文件就属于没有名字的默认(default)包。
 *
 */
fun baz(){
    // 你没有看错，可以直接定义方法
    // 全路径是com.android.kotlin.kotlin.basic_syntax.baz
}
class DefinePackages{
    // // 全路径是com.android.kotlin.kotlin.basic_syntax.baz
}
/**
 * 一些默认的包会被自动导入每个Kotlin源文件。
 * kotlin.*
 * kotlin.annotation.*
 * kotlin.collections.*
 * kotlin.comparisons.* (since 1.1)
 * kotlin.io.*
 * kotlin.ranges.*
 * kotlin.sequences.*
 * kotlin.text.*
 * 一些额外的包会根据目标平台自动导入：
 * --JVM
 *   ----java.lang.*
 *   ----kotlin.jvm.*
 * --JS
 *   ----kotlin.js.*
 */

/**
 * 导入单个文件
 * import com.android.kotlin.kotlin.basic_syntax.DefinePackages
 * 导入所有可以访问的文件
 * import com.android.kotlin.kotlin.basic_syntax.*
 * 如果有命名冲突，可以使用as关键字进行局部重命名
 * import foo.Bar
 * import bar.Bar as bBar
 */
/**
 * import关键字不仅仅可以用来导入类，还可以用来导入其他的申明。
 * 1.top-level函数和属性，比如本文件中的baz函数
 * 2.定义的Object中的函数和属性
 * 3.枚举常量
 * Kotlin不包含静态导入语法。
 */