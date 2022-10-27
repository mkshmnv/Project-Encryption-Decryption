fun getLastDigit(digit: Int) = digit.toString().last()
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}