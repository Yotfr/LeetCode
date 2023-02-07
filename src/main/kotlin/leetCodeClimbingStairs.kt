fun main() {
    fun climbStairs(n: Int): Int {

        val resultArray = IntArray(n+1)

        resultArray[0] = 1
        resultArray[1] = 1

        for (i in 2..n) {
            resultArray[i] = resultArray[i-1] + resultArray[i-2]
        }

        return resultArray[n]

    }

    println(
        climbStairs(15)
    )
}