fun main() {
    val numberOfParts = List(readLine()!!.toInt()) { readLine()!!.toInt() }

    val perfect = numberOfParts.count { it == 0 }
    val larger = numberOfParts.count { it == 1 }
    val smaller = numberOfParts.count { it == -1 }

    print("$perfect $larger $smaller")
}