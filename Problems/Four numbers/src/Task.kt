import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    while( scanner.hasNextInt() )
    {
        println(scanner.nextInt())
    }
}