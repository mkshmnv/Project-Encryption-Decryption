fun main() {
    val begin = readln().toInt()
    val end = readln().toInt()

    for (num in begin..end) {
        println(
            when  {
                num % 3 == 0 && num % 5 == 0 -> "FizzBuzz"
                num % 3 == 0 -> "Fizz"
                num % 5 == 0 -> "Buzz"
                else -> num
            }
        )
    }
}