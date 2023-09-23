package controlflow

fun main() {
    val b = 2
    when (b) {
        1 -> print("b == 1")
        2 -> print("b == 2")
        else -> {
            print("b no es 1 o 2")
        }
    }
}