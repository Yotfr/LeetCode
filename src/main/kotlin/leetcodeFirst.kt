import java.util.HashMap

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
fun main() {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var result: IntArray = intArrayOf()

        var numsMap: HashMap<Int,Int> = hashMapOf()

        nums.forEachIndexed { index, num ->
            var diff = target - num
            if (numsMap.containsKey(diff)) {
                result = intArrayOf(index, numsMap[diff]!!)
                return@forEachIndexed
            }
            numsMap[num] = index
        }
        return result
    }
}

/*

fun optimizedSolution(nums: IntArray, target: Int): IntArray {
    var result: IntArray = intArrayOf()

    var numsMap: HashMap<Int,Int> = hashMapOf()

    nums.forEachIndexed { index, num ->
        numsMap[num] = index
    }
    nums.forEachIndexed { index, num ->
        var diff = target - num
        if (numsMap.containsKey(diff) && numsMap[diff] != index && numsMap[diff] != null) {
            result = intArrayOf(index, numsMap[diff]!!)
            return@forEachIndexed
        }
    }
    return result
}


fun firstSolution(nums: IntArray, target: Int): IntArray {

    var result: IntArray = intArrayOf()

    nums.forEachIndexed { index, number ->
        var diff = target - number
        var secondIndex = nums.indexOfFirst { it == diff }
        if (secondIndex != -1) {
            result = intArrayOf(index, secondIndex)
            return@forEachIndexed
        } else {
            firstSolution(nums.drop(1).toIntArray(), target)
        }
    }
    return result
}

 */
