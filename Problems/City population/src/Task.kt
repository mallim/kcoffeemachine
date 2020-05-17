class City(val name: String) {
    var population: Int = 0
        get() { return Math.min(50_000_000, Math.max(0, field)) }
}