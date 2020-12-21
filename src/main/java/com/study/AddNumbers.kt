package com.study

import kotlin.jvm.JvmStatic
import com.study.AddNumbers

object AddNumbers {
    @JvmStatic
    fun main(args: Array<String>) {
        val number = 20
        val sum = addNumbers(number)
        println("Sum = $sum")
    }

    fun addNumbers(num: Int): Int {
        return if (num != 0) num + addNumbers(num - 1) else num
    }
}