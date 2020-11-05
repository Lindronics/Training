fun main() {
    when (15) {
        in 1..10 -> println("below")
        in 10..20 -> println("just right")
        in 20..30 -> println("above")
    }
}
