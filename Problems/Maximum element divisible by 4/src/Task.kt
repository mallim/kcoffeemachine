import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOfTimesToRepeat = scanner.nextInt()
    var theMaxElement = 0
    repeat(numberOfTimesToRepeat)
    {
        val naturalNumber = scanner.nextInt()
        theMaxElement = if( naturalNumber % 4 == 0 ) Math.max(naturalNumber, theMaxElement) else theMaxElement
    }
    println()
    println(theMaxElement)
}