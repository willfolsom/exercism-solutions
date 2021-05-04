object Raindrops {

    fun convert(n: Int): String {
        var rain : String = ""

        for (i in 1..8) {
            if (n % i == 0) {
                if (i == 3) {
                    rain += "Pling"
                } else if (i == 5) {
                    rain += "Plang"
                } else if (i == 7) {
                    rain += "Plong"
                }
            }
        }

        return if (rain == "") n.toString() else rain
    }
}
