package lambda

val calculateCylinderSurfaceArea: (Int, Int) -> Int = { height, diameter ->
    val radius = diameter / 2
    2 * 3 * radius * (radius + height)
}

fun calculateCylinderSurfaceArea(height: Int, radius: Int, formula: (Int, Int) -> Int): Int {
    return formula(height, radius)
}

fun main(): Unit{
    val simpleSumLambda : (Int) ->Int  = {x:Int ->x + x};
    var resultSimpleSumLambda :Int = simpleSumLambda(5);

    println("Result of simpleSumLambda, parameter: 5 = $resultSimpleSumLambda");

    val sumLambda : (Int,Int) -> Int = {x:Int, y:Int -> x +y };
    var resultSumLambda: Int = sumLambda(5,10);

    println("Result of sumLambda, parameter: 5 , 10 = $resultSumLambda");


    val height = 7
    val diameter = 6

    val surfaceArea = calculateCylinderSurfaceArea(height, diameter)

    println("Result of surface area of Cylinder, parameters: height $height , diameter $diameter = $surfaceArea")


    val radius = 3 // Radio del cilindro

    val cylinderSurfaceArea = calculateCylinderSurfaceArea(height, radius) { h, r ->
        2 * 3 * r * (r + h)
    }

    println("Result of surface area of Cylinder, parameters: height $height , radius $radius = $cylinderSurfaceArea")
}
















