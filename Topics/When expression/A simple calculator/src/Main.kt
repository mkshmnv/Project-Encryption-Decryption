fun main() {
    val (firstNumber, operator, secondNumber) = readln().split(" ")
    println(
        when (operator) {
            "+" -> firstNumber.toLong() + secondNumber.toLong()
            "-" -> firstNumber.toLong() - secondNumber.toLong()
            "*" -> firstNumber.toLong() * secondNumber.toLong()
            "/" -> {
                if (secondNumber.toLong() != "0".toLong()) {
                    firstNumber.toLong() / secondNumber.toLong()
                } else {
                    "Division by 0!"
                }
            }
            else -> "Unknown operator"
        }
    )
}