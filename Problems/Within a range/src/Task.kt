import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()
    val fourth = scanner.nextInt()
    val fifth = scanner.nextInt()
    println( fifth in first..second || fifth in third..fourth )
}