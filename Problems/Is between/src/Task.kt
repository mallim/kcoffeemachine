import java.util.Scanner
import kotlin.system.exitProcess

fun readInts(separator: Char = ' ') =
        readLine()!!.split(separator).map(String::toInt)

fun main(args: Array<String>) {
    var list : List<Int> = readInts()
    val mid = list.get( 1 )
    if( list.first() in mid .. list.last() )
    {
        println("true")
        exitProcess( 0 )
    }
    else if( list.first() in list.last() .. mid )
    {
        println("true")
        exitProcess( 0 )
    }
    println("false")
}