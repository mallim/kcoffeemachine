import java.util.Scanner

// write your function here
fun isVowel( input:Char ):Boolean = "aeiou".indexOf(input.toLowerCase()) >= 0

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}