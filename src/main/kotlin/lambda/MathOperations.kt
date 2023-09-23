package lambda

fun calculateOperation(x: Int,y: Int, operation:(x:Int,y:Int)->Int): Int{
    return operation(x,y);
}

fun main(): Unit{
    val x =10;
    val y=5;

    println("Parameters: $x and $y");

    val addition :Int = calculateOperation(x,y) {x,y -> x + y};
    println("Result of addition is $addition");

    val subtraction :Int = calculateOperation(x,y) {x,y -> x - y};
    println("Result of subtraction is $subtraction");

    val multiplication :Int = calculateOperation(x,y) {x,y -> x * y};
    println("Result of multiplication is $multiplication");

    val division :Int = calculateOperation(x,y) {x,y -> x / y};
    println("Result of division is $division");
}