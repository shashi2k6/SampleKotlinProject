package com.study

import kotlin.jvm.JvmStatic

object Main {
    fun myMethod() {
        println("Hello World!")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        myMethod()
    }
}