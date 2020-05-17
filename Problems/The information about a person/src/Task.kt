import java.util.Scanner

fun readString(separator: Char = ' ') = readLine()!!.split(separator)

fun main(args: Array<String>) {
    val list : List<String> = readString()
    println("${list.first().get(0)}. ${list.get(1)}, ${list.get(2)} years old")
}