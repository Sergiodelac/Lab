package enums

fun main(){
    println("Precio del metal ${PreciousMetal.PLATINUM} en el mercado ${PreciousMetal.PLATINUM.price()}");
    println("Precio del metal ${PreciousMetal.GOLD} en el mercado ${PreciousMetal.GOLD.price()}");
    println("Precio del metal ${PreciousMetal.RHODIUM} en el mercado ${PreciousMetal.RHODIUM.price()}");
    println("Precio del metal ${PreciousMetal.PALLADIUM} en el mercado ${PreciousMetal.PALLADIUM.price()}");


    val currentDay = WeekDay.FRIDAY // Puedes cambiar el día actual según tus necesidades

    val nextDay = when (currentDay) {
        WeekDay.MONDAY -> "Martes"
        WeekDay.TUESDAY -> "Miércoles"
        WeekDay.WEDNESDAY -> "Jueves"
        WeekDay.THURSDAY -> "Viernes"
        WeekDay.FRIDAY -> "Sábado"
        WeekDay.SATURDAY -> "Domingo"
        WeekDay.SUNDAY -> "Lunes"
    }

    println("Hoy es $currentDay y el día siguiente es $nextDay")

}