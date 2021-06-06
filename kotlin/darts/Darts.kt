import kotlin.math.pow
import kotlin.math.sqrt

object Darts {

    fun score(x: Number, y: Number): Int {
        val distanceFromCenter: Double = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))

        return when {
            distanceFromCenter > 10 -> return 0
            distanceFromCenter > 5 -> return 1
            distanceFromCenter > 1 -> return 5
            else -> 10
        }
    }
}
