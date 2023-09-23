package exceptions

fun raiseException(): Nothing {
    throw RuntimeException("Null Default Exception");
}

fun textLength(text:String?): Int {
    val result:Int = when (text){
        null -> raiseException();
        else -> text.length
    }
    return result;
}

fun main():Unit {
    val nullText: String? = null;
    val nonNullText : String = "Hi there!";
    try {
        println("Text length is ${textLength(nonNullText)}")
        println("Text length is ${textLength(nullText)}")
    } catch (e: RuntimeException) {
        println("Text mustn't be null")
    }


}






