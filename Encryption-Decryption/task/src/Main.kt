import java.io.File

// Make global constant
const val ENCRYPTION = "enc"
const val DECRYPTION = "dec"
var MODE = DECRYPTION
var KEY = 0
var DATA = ""

fun main(o: Array<String>) {

    val one = arrayOf("-mode", "enc", "-key", "5", "-data", "Welcome to hyperskill!", "-out", "output.txt")
    val args = arrayOf("-mode", "enc", "-key", "5", "-data", "Welcome to hyperskill!")
    val third = arrayOf("-key", "5", "-data", "\\jqhtrj%yt%m~ujwxpnqq&", "-mode", "dec")

    values(args)

    if ("-in" in args && "-out" in args) {
        val myFile = File(args[args.indexOf("-out") + 1])
        myFile.writeText(crypt(DATA, KEY))
    } else if ("-data" in args || "-in" in args) {
        println(crypt(DATA, KEY))
    }
}

//    Parsing input information
fun values (inputArray: Array<String>) {
    when {
        ("-mode" in inputArray) -> MODE = DECRYPTION
        ("-key" in inputArray) -> KEY = inputArray[inputArray.indexOf("-key") + 1].toInt()
        ("-data" in inputArray) -> DATA = inputArray[inputArray.indexOf("-data") + 1]
//        ("-in" in inputArray && "-data" !in inputArray) -> {
//            val fileName = inputArray[inputArray.indexOf("-in") + 1]
//            val file = File(fileName)
//            DATA = file.readText()
//        }
    }
}

// Encryption and decryption
fun crypt(message: String, key: Int): String {
    var encryptMessage = ""
    when (MODE) {
        ENCRYPTION -> {
            for (letter in message) {
                encryptMessage += (letter.code + key).toChar()
            }
        }
        DECRYPTION -> {
            for (letter in message) {
                encryptMessage += (letter.code - key).toChar()
            }
        }
        else -> {
            throw Exception("Error")
        }
    }
    return encryptMessage
}