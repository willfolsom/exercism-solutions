object Acronym {
    fun generate(phrase: String) : String {
        var g = phrase.replace("-", " ").replace("_", " ").split(" ")
        var output = ""
        for (s in g) {
            if (s.count() < 1) continue else output += s[0].toUpperCase()
        }
        return output
    }
}
