class ClassDemo constructor(var number1: Int, var number2: Int) {

    init {
        // runs before constructor
        println(number1)
    }

    constructor(number1: Int, number2: Int, number3: Int) : this(number1, number2) {

    }

    init {
        // runs after constructor
    }

    fun addition(): Int {
        return this.number1 + this.number2
    }
}

fun main() {
    var x = ClassDemo(1, 2)
    println(x.addition())
}

class ClassDemo2 constructor(var s: String) {
    init {
        // s is already stored, now store s' length too
        var len = s.length
    }

    constructor(s: String, s2: String) : this(s) {
        // This constructor executes the primary constructor,
        // the first init block, then this block
        var len2 = s2.length
    }
}