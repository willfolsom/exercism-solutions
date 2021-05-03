object Pangram {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    fun isPangram(input: String): Boolean {
        val alphabetMap = LinkedHashMap<Char, Int>();

        for (letter in alphabet) {
            alphabetMap.putIfAbsent(letter, 0);
        }

        for (i in input) {
            val u = i.toUpperCase()
            if (alphabetMap[u] != null) {
                alphabetMap[u] = alphabetMap[u]!! + 1;
            }
        }

        return !alphabetMap.containsValue(0);
    }
}
