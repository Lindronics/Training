interface Parent {
    val hairColour: String
        get() = "black"

    val eyeColour: String
        get() = "blue"
}

class Child : Parent {
    override val hairColour = "brown"
}

fun main() {
    var x = Child()
    println(x.hairColour)
    println(x.eyeColour)
}