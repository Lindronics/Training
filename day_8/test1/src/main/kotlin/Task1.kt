import java.util.Collections.reverse

fun countWords(s: String): Int {
    return s.split(" ").size
}

fun printVertically(s: String, reversed: Boolean = false) {
    if (!reversed) s.split(" ").forEach(::println)
    else s.split(" ").reversed().forEach(::println)
}

fun main() {
    var s = "this is a short test"
    s.let(::countWords).apply(::println)
    printVertically(s)
    printVertically(s, reversed = true)
}