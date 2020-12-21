package com.study

import kotlin.jvm.JvmStatic

object MultiplicationTable {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = 5
        for (i in 1..10) {
            System.out.printf("%d * %d = %d \n", num, i, num * i)
        }
    }
}