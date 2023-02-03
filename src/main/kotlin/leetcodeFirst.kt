/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
fun main() {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result: IntArray = intArrayOf()
        nums.forEachIndexed { index, number ->
            var diff = target - number
            var secondIndex = nums.indexOfFirst { it == diff }
            if (secondIndex != -1) {
                result = intArrayOf(index, secondIndex)
                return@forEachIndexed
            } else {
                twoSum(nums.drop(1).toIntArray(), target)
            }
        }
        return result
    }
}