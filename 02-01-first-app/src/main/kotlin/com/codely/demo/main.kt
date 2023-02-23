package com.codely.demo

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Please enter a date with the format <yyyy-MM-dd>")
    val line = supportNullableString(readLine())
    if (line.isNullOrEmpty()) {
        println("The data is not valid")
        exitProcess(1)
    }
        val input = LocalDate.parse(line)
        println("You wrote $input")
        val currentDate = LocalDate.now()
        val different = Period.between(input, currentDate)
        println("The difference between the date you wrote and today is ${different.years}")
    }

fun supportNullableString(line: String?) = line




// Code Notes
//:String? = readLine() - puede ser string o null