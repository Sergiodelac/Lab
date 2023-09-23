package controlflow

fun main (){

    val range = 1 .. 10;

    for (count in range){
        println("Common range $count");
    }

    val reverseRange = 10 downTo 1;

    for (count in reverseRange){
        println("reverseRange: $count ");
    }
    for (count in reverseRange step 2){
        println("Another way to print a reverseRange $count");
    }

}