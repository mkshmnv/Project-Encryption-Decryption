fun main() {
    val arr = List(4) { readln().toInt() }
    val five = readln().toInt()
    print(five in arr[0]..arr[1] && five in arr[2]..arr[3])
}