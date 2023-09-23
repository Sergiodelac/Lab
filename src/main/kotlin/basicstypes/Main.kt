package basicstypes

import classes.Course

fun main() {
    val materia1: Course = Course();
    val materia2: Course = Course(
        1,
        "Como evitar cualquier extra en 24 horas",
        "Diego Go"
    );
}