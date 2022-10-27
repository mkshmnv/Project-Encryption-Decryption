fun move(digit: Int) {
    print(when (digit) {
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "move right"
        0 -> "do not move"
        else -> "error!"
    })
}

fun main() {
    move(readln().toInt())
}