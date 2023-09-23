package collections



fun main() {

    val mutableList = mutableListOf("Hector", "Richi", "Malvaes")


    val immutableList = mutableList.toList()


    println("Lista de compañeros:")
    for (companion in immutableList) {
        println(companion)
    }
}
