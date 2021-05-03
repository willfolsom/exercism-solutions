class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(this.constitution)

    companion object {

        fun ability(): Int {
            val dice: IntArray = intArrayOf((1..6).random(), (1..6).random(), (1..6).random(), (1..6).random())
            dice.sortDescending()
            return dice[0] + dice[1] + dice[2]
        }

        fun modifier(score: Int): Int {
            return Math.floor((score.toDouble() - 10) / 2).toInt()
        }
    }

}
