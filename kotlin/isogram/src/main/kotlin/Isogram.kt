object Isogram {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    fun isIsogram(input: String): Boolean {
        val alphabetMap = LinkedHashMap<Char, Int>();

        for (i in input) {
            val u = i.toUpperCase()

            if (alphabet.contains(u)) {
                alphabetMap.putIfAbsent(u, 0);
            }

            if (alphabetMap[u] != null) {
                alphabetMap[u] = alphabetMap[u]!! + 1;
            }
        }

        return alphabetMap.filter{ it.value > 1 }.size == 0
    }
}
