package com.staker4wapper.mvc_todolist

class Model {
    private var number = 0

    fun increaseNumber() {
        number++
    }

    fun getNumber(): Int {
        return number
    }
}