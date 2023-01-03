@file:Suppress("UNUSED_EXPRESSION", "UNREACHABLE_CODE")

package com.example.day2

fun main() {
    var Temperature = 35

    while (Temperature <= 35) {
        Temperature --
        when{
            Temperature == 30 -> println("$Temperature It's Hot")
            Temperature == 20 -> println("$Temperature It's comfy")
            Temperature == 15 -> println("$Temperature It's cold!")
            else->continue


        }

    }
}