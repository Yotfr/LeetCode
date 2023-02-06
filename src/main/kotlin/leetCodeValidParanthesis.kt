import java.util.ArrayDeque

fun main() {

    fun isValid(s: String): Boolean {

        val parenthesisStack = ArrayDeque<Char>()

        s.forEach {
            when {
                (it == '(' || it == '[' || it == '{') -> {
                    parenthesisStack.push(it)
                }

                it == ')' -> {
                    if (parenthesisStack.isEmpty() || parenthesisStack.pop() != '(') {
                        return false
                    }
                }

                it == ']' -> {
                    if (parenthesisStack.isEmpty() || parenthesisStack.pop() != '[') {
                        return false
                    }
                }

                it == '}' -> {
                    if (parenthesisStack.isEmpty() || parenthesisStack.pop() != '{') {
                        return false
                    }
                }
            }
        }

        return parenthesisStack.isEmpty()
    }

    println(
        isValid("()[]{}")
    )


}