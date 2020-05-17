import java.util.*

fun twoQueensSeeEachOther(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
    if (x1 == x2 || y1 == y2) {
        return true // One has picked another
    }
    if (x1 == x2 || y1 == y2) {
        return true // Row or column
    }
    return if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
        true // Diagonal
    } else false
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    if( twoQueensSeeEachOther( x1, y1, x2, y2 ) )
    {
        println("YES")
    }
    else
    {
        println("NO")
    }
}