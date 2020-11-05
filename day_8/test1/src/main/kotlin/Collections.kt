// List
val names = mutableListOf<String>("A", "B", "C")
val names2 = listOf<String>("A", "B", "C")
val numbers = (1..20).toList()
val numbers2 = (15..25).toList()

// Set
val set = setOf(1, 2, 3, 4, 5)
val set2 = setOf(1, 3, 5, 7, 9)

// Map
val map = mapOf(0 to "A", 1 to "B")

fun main() {
    names.add("D")
    println(names)
    println(names2)
    println(names.getOrNull(2))
    println(names.getOrNull(5))
    println(numbers)

    println(set)
    println(set union set2)
    println(set intersect set2)
    println(numbers intersect numbers2)
    println(numbers subtract numbers2)

    println(map.getOrDefault(0, "#"))
    println(map.getOrDefault(2, "#"))

}