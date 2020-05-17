import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val elementsInSequence = scanner.nextInt()
    var display = 1
    for( element in 1 .. elementsInSequence )
    {
        repeat( element )
        {
            print("$element ")
            display++
            if( display > elementsInSequence ) return
        }
        if( display > elementsInSequence ) break
    }
}