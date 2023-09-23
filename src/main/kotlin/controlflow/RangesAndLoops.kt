package controlflow

fun main(){
    val range = 1..10;

    for (count in range) {
        println("Common range $count");
    }
    val reverseRange = 10 downTo 1;
    for (count in reverseRange) {
        println("Reverserange $count");
    }

    for (count in reverseRange step 2) {
        println("Another way to print a reverserange $count");
    }

    fun main() {
        val altura = 5 // Cambia este valor para ajustar la altura del triángulo

        for (i in 1..altura) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
}



