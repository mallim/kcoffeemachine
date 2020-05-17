fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(time: Int){
    var time: Int = time
        get() { return Math.min(127, Math.max(-128, field)) }
}


