import java.util.*

fun readString(separator: Char = ' ') = readLine()!!.split(separator)

fun readInts(separator: Char = ' ') =
        readLine()!!.split(separator).map(String::toInt)

fun main(args: Array<String>) {
    val line1 = readString().joinToString(separator = " ")
    val line2 = readInts()
    val position = line2.get(0)
    val symbol = line1.get(position - 1)
    println("Symbol # $position of the string \"$line1\" is '$symbol'")
}