import java.util.*

fun readString(separator: Char = ' ') = readLine()!!.split(separator)

fun trueFalse( input: String, isLast: Boolean ){
    if( input.isEmpty() )
    {
        return;
    }

    val char = input.single()
    if( char != null && char.isDigit() )
    {
        print("true")
    }
    else {
        print("false")
    }
    if( ! isLast )
    {
        print("\\")
    }
}

fun main(args: Array<String>) {
    val list : List<String> = readString()
    list.forEach({it -> trueFalse( it, it.equals( list.last() ) ) })
}