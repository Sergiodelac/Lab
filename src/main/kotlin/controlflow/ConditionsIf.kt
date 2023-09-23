package controlflow

fun main () {
    // if elese

    val a = 4;
    val b = 2;

    var max = a;
    if (a < b) max = b;
    println("Resultado de la primera condicional: $max");

    var result = if (a > b){
        max = a;
    } else {
        max = b;
    }
    println("resultado de la segunda condicional: $result");

    val number = -50

    val result2 = if (number > 0) {
        "positive number"
    } else{
        "negative number"
    }
    println ("resultado de la tercera condicional: $result2");

    val result3 = if (a > b) {
        println("$a es mayor que $b")
        a
    } else {
        println("$a es menor o igual a $b")
        b
    }
    println("resultado de la cuarta cindicional: $result3");
}