package tests

import classes.Subject1
import interfaces.Subject1Repository

class Subject1DAO : Subject1Repository {
    override fun save(subject1: Subject1): Subject1 {
        println("Nueva Subject: ${subject1.name}")
        return subject1
    }

    override fun update(subject1: Subject1): Subject1 {
        println("Subject actualizada: ${subject1.name}")
        return subject1
    }

    override fun deleteById(id: Int) {
        println("Subject con ID: $id ha sido eliminada")
    }
}

fun main() {

    val subject1DAO = Subject1DAO()


    val subject1 = Subject1(1, "Desarrollo Movil Integral")


    val savedSubject1 = subject1DAO.save(subject1)
    println("Subject guardada: ${savedSubject1.name}")


    val updatedSubject1 = subject1DAO.update(subject1)
    println("Información actualizada de la Subject: ${updatedSubject1.name}")


    val subject1IdToDelete = 1
    subject1DAO.deleteById(subject1IdToDelete)
    println("Subject con ID $subject1IdToDelete eliminada")
}