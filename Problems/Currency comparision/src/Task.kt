import java.util.Scanner
import kotlin.system.exitProcess

enum class Currency {
    USD, EUR, AUD, CFA, ECD, CAD, BRD
}

val dictionary = mapOf(
        "Germany" to Currency.EUR,
        "Australia" to Currency.AUD,
        "Mali" to Currency.CFA,
        "Dominica" to Currency.ECD,
        "Canada" to Currency.CAD,
        "Spain" to Currency.EUR,
        "Brazil" to Currency.BRD,
        "Senegal" to Currency.CFA,
        "France" to Currency.EUR,
        "Grenada" to Currency.ECD,
        "Kiribati" to Currency.AUD
)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val leftCountry = input.next()
    val rightCountry = input.next()
    if( ! dictionary.containsKey( leftCountry ) || ! dictionary.containsKey( rightCountry ) )
    {
        println(false)
        exitProcess(0)
    }
    println( dictionary[leftCountry]!!.equals( dictionary[rightCountry]))
}