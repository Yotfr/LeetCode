import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

/*
Given a roman numeral, convert it to an integer.
 */
@OptIn(ExperimentalTime::class)
fun main() {


    fun romanToInt(s: String):Int {

        var sum = 0
        var previousValue = 0

        val transcript = hashMapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )

        s.reversed().forEach { char ->
            val value = transcript[char.toString()] ?: 0
            if (value < previousValue) {
                sum -= value
            } else {
                sum += value
            }
            previousValue = value

        }

        return sum

    }


    val duration =  measureTime {
        romanToInt("MCXM")
    }
    println(duration)

}


/*
First approach

fun romanToInt(s: String):Int {
    val transcript = hashMapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )
    val secTranscript = hashMapOf(
        "IX" to 9,
        "IV" to 4,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900
    )

    val mappedArray = s.mapIndexed { index, c ->

        if (index == 0) {
            if (secTranscript.containsKey(
                    key = "${s[index]}${s[index + 1]}"
                )
            ) {
                secTranscript["${s[index]}${s[index + 1]}"]
            } else {
                transcript[c.toString()]
            }
        } else if (index == s.length - 1) {
            if (secTranscript.containsKey(
                    key = "${s[index - 1]}${s[index]}"
                )
            ) {
                0
            } else {
                transcript[c.toString()]
            }
        } else {

            if (secTranscript.containsKey(
                    key = "${s[index - 1]}${s[index]}"
                )
            ) {
                0
            } else if (secTranscript.containsKey(
                    key = "${s[index]}${s[index + 1]}"
                )
            ) {
                secTranscript["${s[index]}${s[index + 1]}"]
            } else {
                transcript[c.toString()]
            }
        }

    }

    return mappedArray.sumOf { it ?: 0 }
}
 */
