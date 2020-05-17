import java.util.Scanner

fun readString(separator: Char = ' ') = readLine()!!.split(separator)

fun main(args: Array<String>) {
    var list : List<String> = readString()

    list.forEach({e -> e.toByteArray(Charsets.UTF_16) } )
    val asc = ArrayList(list).sorted()
    if( list.equals( asc ) )
    {
        println("true");
    }
    else
    {
        println("false")
    }
}