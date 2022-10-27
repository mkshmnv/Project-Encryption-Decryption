fun main() {
    val numberOfParts = List(readLine()!!.toInt()) { readLine()!!.toInt() }

    val perfect = numberOfParts.count { it == 0 }
    val larger = numberOfParts.count { it == 1 }
    val smaller = numberOfParts.count { it == -1 }

//    for (i in numberOfParts) {
//        when (i) {
//            0 -> perfect++
//            1 -> larger++
//            -1 -> smaller++
//        }
//    }
    print("$perfect $larger $smaller")
}