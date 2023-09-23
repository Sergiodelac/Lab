package functions

import java.time. LocalDate;
fun printName (name: String) {
    println("This is : $name")
}
fun addition (x: Int, y: Int) : Int {
    return x+y
}
fun printPerson (
    name: String,
    email: String = "",
    birthDate: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and birth date is $birthDate")

}
fun main() {
    val unit = printName( "Paquito");
    println("Unit is $unit");

    var result = addition( 1,  2);
    println("Result is $result");
    printPerson( "Paquito",  "paquito@gmail.com", LocalDate.parse( "2000-01-01"));

    topLevelSubtraction(5,4);

}

