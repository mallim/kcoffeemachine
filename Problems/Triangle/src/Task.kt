import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var list = listOf<Int>(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).sorted()
    println( if( list.subList( 0, 2 ).sum() > list.last() ) "YES" else "NO" )
}