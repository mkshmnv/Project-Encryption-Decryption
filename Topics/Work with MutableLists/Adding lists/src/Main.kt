fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
//     do not touch the lines above
    // first version - concatenation
    println(firstList.joinToString() + ", " + secondList.joinToString())

    // second version - interpolation
//    println("${firstList.joinToString()}, ${secondList.joinToString()}")
}