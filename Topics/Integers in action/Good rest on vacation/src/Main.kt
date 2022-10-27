fun main() {
    val days = readln().toInt()
    val foodCost = readln().toInt() * days
    val flightCost = readln().toInt() * 2
    val costNight = readln().toInt() * (days - 1)
    println(foodCost + flightCost + costNight)
}