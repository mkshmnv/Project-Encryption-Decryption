fun main() {
    val listNumbers = List(readln().toInt()) { readln().toInt() }
    var count = 0
    for (element in listNumbers) {
        if ( element > 0) {
            count += 1
        }
    }
    println(count)
}