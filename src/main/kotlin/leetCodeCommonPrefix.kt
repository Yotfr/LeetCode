fun main() {

    fun longestCommonPrefix(strs: Array<String>): String {
        val commonPrefixArray = mutableListOf<Char>()
        strs[0].forEachIndexed { index, char ->
            try {
                strs.forEach {
                    if (it[index] != char) {
                        return commonPrefixArray.joinToString ("")
                    }
                }
                commonPrefixArray.add(char)
            } catch (e:Exception) {
                if (e is IndexOutOfBoundsException) {
                    return commonPrefixArray.joinToString ("")
                }
            }

        }
        return commonPrefixArray.joinToString ("")
    }
}