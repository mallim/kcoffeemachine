import java.util.*
import kotlin.system.exitProcess

fun main() {
    val input = readLine()!!
    if( input.isEmpty() ) exitProcess( 0 )
    when( input.first() )
    {
        'i' -> println( input.substring( 1 ).toInt() + 1 )
        's' -> println( input.substring( 1 ).reversed() )
        else -> println( input )
    }
}