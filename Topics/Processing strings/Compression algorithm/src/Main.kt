fun main() {
    val inputString = readln()
    var outputString = inputString.first().toString()
    var count = 0

    for (letter in inputString) {
        if (outputString.last() == letter) {
            count++
        } else {
            outputString += count
            outputString += letter
            count = 1
        }
    }
    outputString += count
    println(outputString)
}