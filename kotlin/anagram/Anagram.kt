class Anagram(private val targetWord: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val output: MutableSet<String> = mutableSetOf()
        val tLower = targetWord.toLowerCase()
        val targetWordCollection = tLower.split("").sorted()

        for (a in anagrams) {
            val aLower =  a.toLowerCase()
            val aCollection = aLower.split("").sorted()

            if (targetWordCollection.equals(aCollection) &&
                targetWordCollection.size == aCollection.size &&
                tLower != aLower) {
                output.add(a)
            }
        }

        return output
    }
}
