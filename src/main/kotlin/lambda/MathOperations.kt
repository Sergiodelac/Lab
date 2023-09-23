package lambda

fun calculateOperation(x: Double, y: Double, operation: (x: Double, y: Double) -> Double): Double {
    return operation(x, y)
}

fun main(): Unit {
    val x = 10.0
    val y = 5.0

    println("Parameters: $x and $y")

    val addition = calculateOperation(x, y) { x, y -> x + y }
    println("Result of addition is $addition")

    val subtraction = calculateOperation(x, y) { x, y -> x - y }
    println("Result of subtraction is $subtraction")

    val multiplication = calculateOperation(x, y) { x, y -> x * y }
    println("Result of multiplication is $multiplication")

    val division = calculateOperation(x, y) { x, y -> x / y }
    println("Result of division is $division")
}

