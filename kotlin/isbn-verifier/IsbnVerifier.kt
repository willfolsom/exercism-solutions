class IsbnVerifier {

    fun isValid(isbn: String): Boolean {
        var n = isbn.replace("-", "")

        if (n.length != 10 || (!Character.isDigit(n.last()) && !n.last().equals('X'))) return false

        var total = 0
        for (i in 0..8) {
            if (!Character.isDigit(n[i])) return false
            total += Character.getNumericValue(n[i]) * (10-i)
        }

        total += if (n.last().equals('X')) 10 else Character.getNumericValue(n.last())

        return total % 11 == 0
    }
}
