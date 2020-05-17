import java.util.*

fun readInts(separator: Char = ' ') =
        readLine()!!.split(separator).map(String::toInt)

fun main(args: Array<String>) {
    val box1 = readInts().sorted()
    val box2 = readInts().sorted()
    val countBox1InBox2 = box1.filterIndexed{ index, it -> it <= box2[index]}.count()
    val countBox2InBox1 = box1.filterIndexed{ index, it -> it >= box2[index]}.count()
    val countAllEqual = box1.filterIndexed{ index, it -> it == box2[index]}.count()
    println(if( countAllEqual == 3 )
    {
        "Box 1 = Box 2"
    }
    else if( countBox1InBox2 == 3 )
    {
        "Box 1 < Box 2"
    }
    else if( countBox2InBox1 == 3 )
    {
        "Box 1 > Box 2"
    }
    else {
        "Incomparable"
    })
}