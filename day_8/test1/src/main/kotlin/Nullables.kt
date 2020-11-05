fun main() {
    var s: String? = null

    val size = s?.length ?: -1
    println(size)

    //!! only used when you're aware of the value
    val l = s!!.length

}