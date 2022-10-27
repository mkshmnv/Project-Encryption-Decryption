fun main() {
    val leastHours = readln().toInt()
    val moreThanHours = readln().toInt()
    val sleepsHours = readln().toInt()

    if (leastHours > sleepsHours) println("Deficiency")
    if (sleepsHours in leastHours..moreThanHours) println("Normal")
    if (sleepsHours > moreThanHours) println("Excess")
}