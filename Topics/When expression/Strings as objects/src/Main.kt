fun main() {
    val input = readln()

    when {
        input.isEmpty() -> println("")
        input.first() == 'i' -> {
            val str = input.substring(1, input.length)
            val tmp = input.drop(1)
            println(str.toInt() + 1)
        }
        input.first() == 's' -> println(input.drop(1).reversed())
        else -> println(input)

    }
}