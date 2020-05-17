import kotlin.system.exitProcess

fun readInts(separator: Char = ' ') =
        readLine()!!.split(separator).map(String::toInt)

fun main(args: Array<String>) {
    var list : List<Int> = readInts()
    val asc = ArrayList(list).sorted()
    if(list.equals(asc)) {
        println("true")
        exitProcess( 0 )
    }
    val desc = ArrayList(list).sortedDescending()
    if(list.equals(desc)) {
        println("true")
        exitProcess( 0 )
    }
    println("false")
}