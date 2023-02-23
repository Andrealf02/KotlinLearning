package com.codely.demo

import java.time.LocalDate

fun main() {
    println("Please enter a date with the format <yyyy-MM-dd>")
    //:String? = readLine() - puede ser string o null
    val readLine: String? = null
    readLine?.let{
        val input = LocalDate.parse(readLine)
        println("You wrote $input ${input.dayOfWeek}")
    }
}

