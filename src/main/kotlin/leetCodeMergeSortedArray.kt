
fun main() {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m-1
        var j = n-1
        var k = nums1.lastIndex

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]
                k--
                i--
            }else {
                nums1[k] = nums2[j]
                k--
                j--
            }
        }
    }
}