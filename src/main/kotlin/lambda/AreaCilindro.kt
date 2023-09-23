package lambda

val calcularAreaCilindro: (Double, Double) -> Double = { r, h ->
    2 * Math.PI * r * (r + h)
}

fun main() {
    println("Ingrese el radio del cilindro:")
    val radio = readLine()?.toDoubleOrNull()

    if (radio == null || radio <= 0) {
        println("El radio debe ser un número positivo.")
        return
    }

    println("Ingrese la altura del cilindro:")
    val altura = readLine()?.toDoubleOrNull()

    if (altura == null || altura <= 0) {
        println("La altura debe ser un número positivo.")
        return
    }

    val areaTotal = calcularAreaCilindro(radio, altura)
    println("El área total del cilindro es: $areaTotal")
}
