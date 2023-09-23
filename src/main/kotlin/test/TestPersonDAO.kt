package test

import classes.Person
import dao.PersonDAO

fun main() {
    val personDAO = PersonDAO()
    val person = Person(1, "Pedrito", true)

    val savedPerson = personDAO.save(person)
    println("Persona guardada: ${savedPerson.name}")

    val updatedPerson = personDAO.update(Person(1, "Pedrito Updated", true))
    println("Persona actualizada: ${updatedPerson.name}")

    personDAO.deleteById(1)
}
