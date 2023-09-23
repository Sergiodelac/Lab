package classes

open class Subject1 (val id: Int = 0,val name: String = "Desarrollo Movil Integral",val status: Boolean = false){
    open fun isApproved(): Boolean {
        return this.status;
    }
}