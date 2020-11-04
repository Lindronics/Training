var newVar: String? = null
lateinit var test: String;

fun main() {
    println(newVar)
    println("hello my friends")
    testPrint("my friends")
    testPrint()
}

fun testPrint(str: String = "test"): String {
//    str += "test"
    return str
        .also(::println)
        .also(::println)
}

fun testBoolean(str : String) : Boolean {
    return str is String
}
