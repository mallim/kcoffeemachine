class Application(val name: String) {

    // write the run method here
    fun run( param:Array<String> ){
        println("$name")
        param.forEach(::println)
    }
}