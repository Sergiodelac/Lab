package tests



import classes.Person
import interfaces.PersonRepository

class PersonDAO : PersonRepository {
    override fun save(person: Person): Person {
        println("Nueva persona: ${person.name}")
        return person
    }

    override fun update(person: Person): Person {
        println("Persona actualizada: ${person.name}")
        return person
    }

    override fun deleteById(id: Int) {
        println("Persona con ID: $id ha sido eliminada")
    }
}

fun main() {

    val personDAO = PersonDAO()


    val person = Person(1, "Pedrito")


    val savedPerson = personDAO.save(person)
    println("Persona guardada: ${savedPerson.name}")


    val updatedPerson = personDAO.update(person)
    println("Información actualizada de la persona: ${updatedPerson.name}")


    val personIdToDelete = 1
    personDAO.deleteById(personIdToDelete)
    println("Persona con ID $personIdToDelete eliminada")
}

