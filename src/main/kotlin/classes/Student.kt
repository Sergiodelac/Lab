package classes

import collections.SubjectCategory


class Student (val name: String = "Pedrito", val age: Int = 18){
var email:  String = "";

    constructor(email: String): this(){
        this.email = email;
    }

fun action() {
    val message = "It´s going to approve";
    println(message)
}

}
fun main() {
    val student = Student()
    student.action()

    val student1 = Student(email="pedrito@utvtol.edu.mx");
    student1.action();

    println("Name: ${student.name} , age: ${student1.age}, email: ${student1.email}");

    val student2 = Student(name = "Carlos", age = 50);
    println("Name: ${student2.name}, age: ${student2.age}, email: ${student2.email}");



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

class Subject(val id: Int = 1,val name: String = "Desarrollo Movil Integral") {
    constructor(id: Int, name: String, code: SubjectCategory) : this(id,name) {
        this.code = code
    }


    var code: Any = ""

    fun action() {
        println("Materia: $name")
    }
}






