package com.seedlegals.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController(
    private val calculatorService: CalculatorService
) {

    @GetMapping("/add")
    fun add(
        @RequestParam a: Int,
        @RequestParam b: Int
    ): Int = calculatorService.add(a, b)

    @GetMapping ("/subtract")
    fun subtract (
        @RequestParam a: Int,
        @RequestParam b: Int
    ): Int = calculatorService.subtract(a,b)

    @GetMapping ("/multiple")
    fun multiple(
        @RequestParam a: Int,
        @RequestParam b: Int
    ): Int = calculatorService.multiple(a,b)

    @GetMapping ("/divide")
    fun divide(
        @RequestParam a: Int,
        @RequestParam b: Int
    ): Double = calculatorService.divide(a,b)

}
