package basictypes

import classes.*

fun main(args: Array<String>) {
    println("Hello World!")
    val university = University(1, "UTVT", "Fundada en 2001")
    val materia1:Course = Course();
    val materia2:Course = Course(id = 1, name = "Como evitar cualquier extra en 24 horas", teacherName = "Diego go");
   val person = Person(  0, "Pedrito", false)
val universityStudent = UniversityStudent(1, "Hector",true)

    val student = CollegeStudent.CollegeStudent("Juan", 20)
    println("Nombre: ${student.name}")
    println("Edad: ${student.age}")
    val isApproved = student.isApproved()
    println("¿Aprobado? $isApproved")

    println(materia1);
    println(materia2);
    println(university);
    println(person);
    println(universityStudent);

}