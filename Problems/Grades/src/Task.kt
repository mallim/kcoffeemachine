import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOfTimesToRepeat = scanner.nextInt()
    var abcdTallyCount = mutableMapOf( "A" to 0, "B" to 0, "C" to 0, "D" to 0 )
    repeat( numberOfTimesToRepeat )
    {
        val grade = scanner.nextInt()
        val position = when( grade )
        {
            2 -> "D"
            3 -> "C"
            4 -> "B"
            5 -> "A"
            else -> -1
        }
        abcdTallyCount.put(position as String, abcdTallyCount[position]!!.inc() )
    }
    println("${abcdTallyCount["D"]} ${abcdTallyCount["C"]} ${abcdTallyCount["B"]} ${abcdTallyCount["A"]}")
}