package interfaces

import classes.Person

interface PersonRepository {
    fun save (person: Person): Person;
    fun update (person: Person): Person;
    fun deleteById(id:Int):Unit;
}