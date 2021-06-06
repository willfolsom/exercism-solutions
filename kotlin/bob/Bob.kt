object Bob {
    fun hey(input: String): String {
        val letters = input.filter { it.isLetter() }
        val onlyUpper = letters.all { it.isUpperCase() }
        val yelling = onlyUpper && letters.isNotEmpty()
        val question = input.trimEnd().endsWith("?")

        return when {
            question && yelling -> "Calm down, I know what I'm doing!"
            question -> "Sure."
            yelling -> "Whoa, chill out!"
            input.isBlank() -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }
}
