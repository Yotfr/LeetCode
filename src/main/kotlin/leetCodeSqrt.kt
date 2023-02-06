import kotlin.math.sqrt

fun main() {
    fun mySqrt(x: Int): Int {
        var i = 1
        while (i <= x/i) {
            i++
        }
        return i - 1
    }

    println(
        mySqrt(8).toString()
    )
}