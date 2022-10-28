const val ENCRYPTION = "enc"
const val DECRYPTION = "dec"
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

fun main() {
    val keyCryption = readln().lowercase()
    val inputMessage = readln()
    val inputKey = readln().toInt()
    encryption(inputMessage, inputKey)

    println(
        when (keyCryption) {
            ENCRYPTION -> {
                encryption(inputMessage, inputKey)
            }

            DECRYPTION -> {
                decryption(inputMessage, inputKey)
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