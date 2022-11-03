// Make global constant
const val ENCRYPTION = "enc"
const val DECRYPTION = "dec"
var MODE = DECRYPTION
var KEY = 0
var DATA = ""

// Perform encryption and decryption
fun encryption(message: String, key: Int): String {
    var encryptMessage = ""
    for (letter in message) {
        encryptMessage += (letter.code + key).toChar()
    }
    return encryptMessage
}

fun decryption(message: String, key: Int): String {
    var encryptMessage = ""
    for (letter in message) {
        encryptMessage += (letter.code - key).toChar()
    }
    return encryptMessage
}

// Verify input information
fun checkMode(mode: String) {
    MODE = (if (mode == DECRYPTION) DECRYPTION else ENCRYPTION).toString()
}

fun checkKey(key: Int?) {
    KEY = key ?: 0
}

fun checkData(data: String?) {
    DATA = data ?: ""
}

fun clarification(inputArray: Array<String>) {
    for ((index, value) in inputArray.withIndex()) {
        when {
            value == "-mode" -> checkMode(inputArray[index + 1])
            value == "-key" -> checkKey(inputArray[index + 1].toInt())
            value == "-data" -> checkData(inputArray[index + 1])
        }
    }
}

fun main(args: Array<String>) {

    // Clarification input information
    clarification(args)

    // Initiate encryption and decryption
    println(
        when (MODE) {
            ENCRYPTION -> {
                encryption(DATA, KEY)
            }

            DECRYPTION -> {
                decryption(DATA, KEY)
            }

            else -> {
                println("Error!")
            }
        }
    )
}

// Stage 2/6
//    val message = readln().lowercase()
//    val decryptKey = readln().toInt()
//    val alphabets = "abcdefghijklmnopqrstuvwxyz"
//    var encryptMessage = ""
//
//    for (letter in message) {
//        encryptMessage += if (alphabets.contains(letter)) {
//            val tempIndex = alphabets.indexOf(letter) + decryptKey
//            if (tempIndex > alphabets.length - 1) {
//                alphabets[tempIndex - alphabets.length]
//            } else {
//                alphabets[tempIndex]
//            }
//        } else {
//            letter
//        }
//    }
//    println(encryptMessage)

// Stage 1/6
//    val message = "we found a treasure!"
//    var encryptMessage = ""
//    val alphabets = ('a'..'z').toList()
//
//    for (letterMessage in message.lowercase()) {
//        encryptMessage += if (alphabets.contains(letterMessage)) {
//            alphabets.reversed()[alphabets.indexOf(letterMessage)]
//        } else {
//            letterMessage
//        }
//    }
//    println(encryptMessage)