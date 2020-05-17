import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    when (scanner.next()) {
        "rectangle" -> println(scanner.nextDouble() * scanner.nextDouble())
        "circle" -> println(3.14 * scanner.nextDouble().pow(2))
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            println(0.25 * sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c)))
        }
    }
}
