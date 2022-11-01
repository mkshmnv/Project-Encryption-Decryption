fun main() {
    val arr = List(5) { readln().toInt() }
    print(arr[4] in arr[0]..arr[1] || arr[4] in arr[2]..arr[3])
}