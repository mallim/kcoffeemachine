import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var largestElement = 0
    do
    {
        val input = scanner.nextInt()
        largestElement = Math.max( input, largestElement )
    } while( input > 0 )
    println(largestElement)
}