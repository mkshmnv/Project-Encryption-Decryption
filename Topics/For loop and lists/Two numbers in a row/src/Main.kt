//fun main() {
//    val s = List(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")
//    val (a, b) = readLine()!!.split(" ")
//    println(if ("$a $b" in s || "$b $a" in s) "NO" else "YES")
//}



fun main() {
//    val sizeList = readln().toInt()
//    val numbersList = List(sizeList) { readln().toInt() }
//    val checkNumbers: List<String> = readln().split(" ")
//    var outputResult = "YES" // "NO"
//
//    for ((index, element) in numbersList.withIndex()) {
//        if (checkNumbers.contains(element.toString())) {
//            if (index == 0) {
//                if (checkNumbers.contains(numbersList[1].toString())) {
//                    outputResult = "NO"
//                }
//            } else if (index == numbersList.lastIndex) {
//                if (checkNumbers.contains(numbersList[index - 1].toString())) {
//                    outputResult = "NO"
//                }
//            } else if (checkNumbers.contains(numbersList[index - 1].toString()) || checkNumbers.contains(numbersList[index + 1].toString())) {
//                outputResult = "NO"
//            } else {
//                outputResult = "YES"
//            }
//        }
//    }
//    println(outputResult)

    val greeting = "Hello"
    for ((index, element) in greeting. withIndex()) {
        println("$index - $element")
    }
    println(greeting.substring(0, 3)) // "Hel"
    println(greeting.substring(0, 3)) // "el"
    println(greeting.substring(2, endIndex = 2))    // "llo"
    println(greeting.substring(4, 5)) // "o"
}

