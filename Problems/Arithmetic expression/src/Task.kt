import java.util.*

fun readInts(separator: Char = ' ') =
        readLine()!!.split(separator).map(String::toInt)

fun main(args: Array<String>) {
    // write your code here
    val list : List<Int> = readInts()
    println("${list.first()} plus ${list.last()} equals ${list.sum()}")
}