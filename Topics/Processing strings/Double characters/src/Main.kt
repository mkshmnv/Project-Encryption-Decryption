fun main() {
    val first = readln()
    var second = ""
    for (ch in first) {
        second += "$ch" + "$ch"
    }

    println(second)
}