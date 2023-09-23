package basicstypes

fun main (){
    val greeting = "Hola";
    val world = "World";
    var result: String?;

    result = "Hola"+ "" + world;
    println("Saludo: $result!!1");


    result = greeting.plus("").plus(world).plus("!!2");
    println(result);

    result = "$greeting $world!!3";
    println(result);

    result = """
        |Tell me and I forget
        |Teach me and I remember
        |Involve me and I learn 
        |(Bejamin Franklin)
        """;
}