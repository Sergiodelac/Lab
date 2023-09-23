package collections

val subjectList = subjectList();

val resultFilter = subjectList().filter { x -> x.code == SubjectCategory.CLOUD }

val resultMap = subjectList().map { c -> c.name.uppercase() }.toList();

fun main(): Unit {

    println(resultMap);

}

