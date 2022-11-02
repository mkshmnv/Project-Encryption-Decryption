fun main() {
    val a = readln()
    val devLength = a.length / 2
    println(
        if (a.length % 2 != 0) {
            a.substring(0, devLength) + a.substring(devLength + 1, a.length)
        } else {
            a.substring(0, devLength - 1) + a.substring(devLength + 1, a.length)
        }
    )
}