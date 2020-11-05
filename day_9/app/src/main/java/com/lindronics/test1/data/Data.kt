package com.lindronics.test1.data

class Data() {

    var joinedList: MutableSet<String>
    init {
        var maleNames = listOf("Niklas", "Luke", "Enrico")
        var femaleNames = listOf("Lucy", "Jennifer", "Sumaya")
        joinedList = (maleNames + femaleNames).toMutableSet()
    }

    fun randomName(): String {
        return joinedList.random()
    }

    fun addName(name: String) {
        joinedList.add(name)
    }
}
