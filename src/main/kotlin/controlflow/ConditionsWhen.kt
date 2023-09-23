package controlflow

fun main() {
    val a = 4
    val b = 2

    var max = when {
        a < b -> b
        else -> a
    }

    println("Resultado de la primera condicional: $max")

    val result = when {
        a > b -> {
            max = a
            a
        }
        else -> {
            max = b
            b
        }
    }

    println("Resultado de la segunda condicional: $result")

    val number = -50

    val result2 = when {
        number > 0 -> "Número positivo"
        else -> "Número negativo"
    }

    println("Resultado de la tercera condicional: $result2")

    val result3 = when {
        a > b -> {
            println("$a es mayor que $b")
            a
        }
        else -> {
            println("$b es mayor que $a")
            b
        }
    }

    println("Resultado de la cuarta condicional: $result3")
}




