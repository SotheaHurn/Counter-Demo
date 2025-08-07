package com.example.counterlib

class Counter {
    fun  increase(num: Int) : Int {
        val increased : Int = num+1
        return increased
    }
    fun  decrease(num: Int) : Int {
        val decreased : Int = num-1
        return decreased
    }
}