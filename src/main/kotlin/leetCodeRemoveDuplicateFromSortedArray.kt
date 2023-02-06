
fun main() {
    fun removeDuplicates(nums: IntArray): Int {
        var insertIndex = 1
        nums.forEachIndexed { index, num ->
            if (index != 0) {
                if (nums[index-1] != num) {
                    nums[insertIndex] = nums[index]
                    insertIndex++
                }
            }
        }
        println(nums.joinToString(""))
        return insertIndex
    }

}