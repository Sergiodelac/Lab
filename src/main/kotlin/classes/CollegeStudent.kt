package classes

class CollegeStudent {

    open class Person(val name: String, val age: Int) {

    }


    class CollegeStudent(name: String, age: Int) : Person(name, age) {
        // Constructor secundario de CollegeStudent
        constructor(name: String) : this(name, 18)


        fun isApproved(): Boolean {
            println("No aprobó su décimo cuatrimestre en la UTVT")
            return false
        }
    }


}