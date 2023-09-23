package interfaces

import classes.Subject1

interface Subject1Repository {
    fun save (subject1: Subject1): Subject1;
    fun update (subject1: Subject1): Subject1;
    fun deleteById(id:Int):Unit;
}