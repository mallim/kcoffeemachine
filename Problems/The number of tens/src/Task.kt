import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val strip100 = scanner.nextInt() % 100
    println( strip100 / 10 )
}