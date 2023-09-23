package collections

fun main():Unit {

    val inmutableList : List<String> = listOf("Hello","World");
    println(inmutableList.joinToString (" "));

    var muteableList : MutableList<String> = inmutableList.toMutableList();
    muteableList.add("UTVT!!!")
    println(muteableList.joinToString (" "));

}