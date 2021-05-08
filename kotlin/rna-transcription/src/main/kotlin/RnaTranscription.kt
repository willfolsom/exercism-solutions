fun transcribeToRna(dna: String): String {
    var d : String = ""
    for (i in dna) {
        d += swapLetter(i)
    }

    return d
}

fun swapLetter(i: Char): Char {
    return when(i) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else -> i
    }
}
