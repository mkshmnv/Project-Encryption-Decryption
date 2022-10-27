fun main() {
    val input = readln()

    when {
        input.isEmpty() -> println("")
        input.first() == 'i' -> {
            val tempString = input.substring(0, input.length)
            input.drop(1)
            println(tempString.toInt() + 1)
        }
        input.first() == 's' -> println(input.drop(1).reversed())
        else -> println(input)

    }
}