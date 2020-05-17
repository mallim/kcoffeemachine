import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val durationInDays = scanner.nextInt()
    val foodPerDay = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val hotel = scanner.nextInt()
    println( (durationInDays*foodPerDay) + (flightCost*2) + ((durationInDays-1) * hotel) )
}