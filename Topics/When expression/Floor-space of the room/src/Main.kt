fun main() {
    when (readln()) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val num = (a + b + c) / 2
            println(kotlin.math.sqrt(num * (num - a) * (num - b) * (num - c)))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            println(a * b)
        }
        "circle" -> {
            val r = readln().toDouble()
            println(3.14 * (r * r))
        }
    }
}