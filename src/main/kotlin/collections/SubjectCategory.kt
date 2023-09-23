package collections

import classes.Subject

enum class SubjectCategory {
    DEVELOPMENT,
    BUSINESS,
    SOFT_SKILLS,
    CLOUD,
    HUMAN_RESOURCES
}

fun subjectList(): MutableList<Subject>{
    var list = mutableListOf<Subject>();

    list.add(Subject(1,"PWA",SubjectCategory.CLOUD));
    list.add(Subject(2,"Gestion del proceso de desarrollo de software",SubjectCategory.DEVELOPMENT));
    list.add(Subject(3,"Desarrollo Movil Integral",SubjectCategory.DEVELOPMENT));
    list.add(Subject(4,"Integradora",SubjectCategory.BUSINESS));
    list.add(Subject(5,"Negociacion Empresarial",SubjectCategory.HUMAN_RESOURCES));
    list.add(Subject(6,"Ingles IX",SubjectCategory.SOFT_SKILLS));

    return list;

};
















