package dao

import classes.Subject1
import interfaces.Subject1Repository



    class Subject1DAO: Subject1Repository {
        override fun save(subject1: Subject1): Subject1 {
            println("New subject: ${subject1.name}");
            return subject1;
        }

        override fun update(subject1: Subject1): Subject1 {
            println("Object subject updated: ${subject1.name}");
            return subject1;
        }

        override fun deleteById(id: Int) = println("Subject with id: $id has been deleted");
    }
