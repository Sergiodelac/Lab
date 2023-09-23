package functions

fun topLevelSubtraction( x: Int,  y: Int): Int{
    return x-y;

  val result = topLevelSubtraction(5, 4);
    println("TopLevelSubtraction: $result");
}
fun multiplication(x: Int, y: Int): Int {
    return x * y
}

fun division(x: Int, y: Int): Double {
    if (y == 0) {
        throw IllegalArgumentException("No se puede dividir por cero")
    }
    return x.toDouble() / y.toDouble()
}

fun main() {
    val resultMultiplication = multiplication(5, 4)
    val resultDivision = division(10, 2)

    println("Resultado de la multiplicación: $resultMultiplication")
    println("Resultado de la división: $resultDivision")
}