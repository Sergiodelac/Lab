package functions
import java.time. LocalDate;
fun printName (name: String) {
    println("This is : $name")
}
fun addition (x: Int, y: Int) : Int {
    return x+y
}
fun printPerson (
name: String,
email: String = "",
birthDate: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and birth date is $birthDate")

}
fun main() {
    val unit = printName( "Paquito");
    println("Unit is $unit");

    var result = addition( 1,  2);
    println("Result is $result");
    printPerson( "Paquito",  "paquito@gmail.com", LocalDate.parse( "2000-01-01"));

    topLevelSubtraction(5,4);

}
fun triangulo() {
    val altura = 5  // Altura del triángulo (número de filas)
    val anchoBase = 9 // Ancho de la base del triángulo

    for (i in 1..altura) {
        // Imprimir espacios en blanco
        for (j in 1..altura - i) {
            print(" ")
        }

        // Imprimir asteriscos
        for (k in 1..(2 * i - 1)) {
            print("*")
        }

        println() // Cambiar de línea para la siguiente fila
    }
}
