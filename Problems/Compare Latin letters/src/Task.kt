import java.util.*

fun readString(separator: Char = ' ') = readLine()!!.split(separator)

fun main(args: Array<String>) {
    var list : List<String> = readString()
    // write your code her
    val first = list.first()
    val last = list.last()
    println( first.equals( last, ignoreCase = true ) )
}