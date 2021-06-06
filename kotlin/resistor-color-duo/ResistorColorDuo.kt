object ResistorColorDuo {

    // Located in external file in Exercism
    enum class Color {
        BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
    }

    fun value(vararg colors: Color): Int {
        return (colors[0].ordinal.toString() + colors[1].ordinal.toString()).toInt()
    }
}
