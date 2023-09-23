package collections

import classes.Subject
import collections.SubjectCategory




val developmentFilter: (Subject) -> Boolean = { subject -> subject.code == SubjectCategory.DEVELOPMENT }
val businessFilter: (Subject) -> Boolean = { subject -> subject.code == SubjectCategory.BUSINESS }


fun filterSubjects(list: List<Subject>, predicateFilter: (Subject) -> Boolean): List<Subject> {
    return list.filter(predicateFilter)
}

fun mapSubjectsToStringList(list: List<Subject>): List<String> {
    return list.map { subject -> "${subject.id} - ${subject.name}" }
}

fun main() {

    val developmentSubjects = filterSubjects(subjectList, developmentFilter)
    println("Subjects in DEVELOPMENT category:")
    developmentSubjects.forEach { println("${it.id} - ${it.name}") }


    val businessSubjects = filterSubjects(subjectList, businessFilter)
    println("\nSubjects in BUSINESS category:")
    businessSubjects.forEach { println("${it.id} - ${it.name}") }


    val subjectStrings = mapSubjectsToStringList(subjectList)
    println("\nList of Subjects as Strings:")
    subjectStrings.forEach { println(it) }
}
