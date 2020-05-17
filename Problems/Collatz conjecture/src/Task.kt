import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextInt()
    var output = "${input} "
    while( input > 1 )
    {
        input = if( input % 2 == 0 ) input / 2 else input * 3 + 1
        output += "${input} "
    }
    println(output)
}