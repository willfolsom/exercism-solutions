object Raindrops {

    fun convert(n: Int): String {
        var rain : String = ""

        if (n % 3 == 0) {
            rain += "Pling"
        }
        if (n % 5 == 0) {
            rain += "Plang"
        }
        if (n % 7 == 0) {
            rain += "Plong"
        }

        return if (rain == "") n.toString() else rain
    }
}
