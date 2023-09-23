package controlflow


fun main() {
    val base = 9 // Base del triángulo
    val altura = (base + 1) / 2 // Calcular la altura en función de la base

    for (i in 1..altura) {
        // Imprimir espacios en blanco para alinear el triángulo
        repeat(altura - i) {
            print(" ")
        }

        // Imprimir asteriscos para formar el triángulo
        repeat(i * 2 - 1) {
            print("*")
        }

        // Ir a la siguiente línea después de cada fila
        println()
    }
}
