package classes

fun main() {
    val person = Person(1, "Pedro", false)
    val student = UniversityStudent(2, "Juan", true)

    println("Person: ${person.name} - Approved: ${person.isApproved()}")
    println("University Student: ${student.name} - Approved: ${student.isApproved()}")
}
