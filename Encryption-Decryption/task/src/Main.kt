import java.io.File
fun main(args: Array<String>) {
    val argsMap = args.toList().zipWithNext().toMap()

    val mode = argsMap.getOrDefault("-mode", "enc")
    val key = argsMap.getOrDefault("-key", "0").toInt()
    val data = if ("-data" in args) {
        argsMap.getOrDefault("-data", "")
    } else {
        val fileName = argsMap.getOrDefault("-in", "")
        val text = File(fileName).readText()
        text
    }
    val fileOut = argsMap.getOrDefault("-out", "") ?: ""

    val result = when(mode) {
        "enc" -> encrypt(data, key)
        "dec" -> decrypt(data, key)
        else -> "Error"
    }

    when {
        (fileOut.isEmpty()) -> println(result)
        else -> {
            val myFile = File(fileOut)
            myFile.writeText(result)
        }
    }
}

fun encrypt(data: String, key: Int): String {
    return data.map { it + key }.joinToString("")
}
fun decrypt(data: String, key: Int): String {
    return data.map { it - key }.joinToString("")
}