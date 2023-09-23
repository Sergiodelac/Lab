package dao

import classes.Person
import interfaces.PersonRepository

class PersonDAO: PersonRepository {
    override fun save(person: Person): Person {
        println("New person: ${person.name}");
        return person;
    }

    override fun update(person: Person): Person {
        println("Object person updated: ${person.name}");
        return person;
    }

    override fun deleteById(id: Int) = println("Person whit id: $id has been deleted");
}