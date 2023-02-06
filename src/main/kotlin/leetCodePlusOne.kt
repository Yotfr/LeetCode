

fun main() {
    fun plusOne(digits: IntArray): IntArray {

        for (index in digits.lastIndex downTo 0 ) {
            if (digits[index] < 9) {
                digits[index]++
                return digits
            }
            digits[index] = 0
        }

        val returnDigits = digits.copyOf(digits.size + 1)
        returnDigits[0] = 1
        return returnDigits
    }

    println(
        plusOne(
            intArrayOf(9,9)
        ).joinToString("")
    )
}