package classes

open class Person(val id: Int = 0,val name: String = "Pedrito",val status: Boolean = false) {
    open fun isApproved(): Boolean {
        return this.status;
    }
}