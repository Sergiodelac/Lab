package classes

class Student(val name: String = "Pedrito", val age: Int =10) {
    var email : String = "";
    constructor(email : String): this() {
        this.email = email;
    }
    fun action() {
        val message = "It´s going to approve";
        println(message)
        }
}
fun main() {
    val studen1 = Student("pedrito@utvtol.edu.mx")
    studen1.action();

    println("Name: ${studen1.name}, age ${studen1.age}, email: ${studen1.email}")

    val student2 = Student("Carlos", 50);
    println("Name: ${student2.name}, age: ${student2.age}");

}
class Persona(val name: String = "Pedrito", val age: Int = 0)

fun constructores() {
    // Crear una instancia con valores por defecto
    val persona1 = Persona()

    // Crear una instancia con datos específicos
    val persona2 = Persona("Juanito", 25)

    // Imprimir los valores
    println("Persona 1 - Nombre: ${persona1.name}, Edad: ${persona1.age}")
    println("Persona 2 - Nombre: ${persona2.name}, Edad: ${persona2.age}")
}