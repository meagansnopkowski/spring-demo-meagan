package com.seedlegals.demo

import org.springframework.stereotype.Component

@Component
class CalculatorService {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiple(a: Int, b: Int): Int {
        return a * b
    }
    fun divide(a: Int, b: Int): Double {
        return (a.toDouble ()/b.toDouble())
    }
}
