import java.util.Scanner

fun readString(separator: Char = ' ') = readLine()!!.split(separator)

fun checkChar( inputAsString: String )
{
    if( inputAsString.isEmpty() )
    {
        return
    }

    val input = inputAsString.single();
    if( ! input.isLetterOrDigit() )
    {
        print("false")
        return
    }
    if( input.isUpperCase() )
    {
        print("true")
        return
    }
    else if( ! input.isDigit() )
    {
        print("false")
        return
    }

    val inputAsInt = inputAsString.toInt()
    if( inputAsInt in 1 .. 9 )
    {
        print("true")
    }
    else
    {
        print("false")
    }
}

fun main(args: Array<String>) {
    val list : List<String> = readString()
    list.forEach({it -> checkChar( it ) })}