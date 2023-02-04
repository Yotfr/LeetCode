/*
Given a roman numeral, convert it to an integer.
 */
fun main() {


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

}