package com.lindronics.test1.data

class Data() {

    var joinedList: MutableList<String>
    init {
        var maleNames = listOf("Niklas", "Luke", "Enrico")
        var femaleNames = listOf("Lucy", "Jennifer", "Sumaya")
        joinedList = (maleNames + femaleNames).toMutableList()
    }

    fun randomName(): String {
        return joinedList.random()
    }

    fun addName(name: String) {
        joinedList.add(name)
    }
}
