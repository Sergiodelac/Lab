package lambda

fun main(): Unit {
    val simpleSumLambda = {x: Int -> x + x};
    var resultSimpleSumLambda = simpleSumLambda (5);
    
    println("Result of simpleSumLambda, parameter: 5 = $resultSimpleSumLambda");

    val sumLambda = {x:  Int, y:Int -> x + y};
    var resultSumLambda = sumLambda(5, 10);

    println("Result of sumLambda, parameter; 5, 10 = $resultSumLambda");
}