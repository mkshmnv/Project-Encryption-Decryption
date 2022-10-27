fun main() {
    val message = readln().lowercase()
    val decryptKey = readln().toInt()
    val alphabets = "abcdefghijklmnopqrstuvwxyz"
    var encryptMessage = ""

    for (letter in message) {
        encryptMessage += if (alphabets.contains(letter)) {
            val tempIndex = alphabets.indexOf(letter) + decryptKey
            if (tempIndex > alphabets.length - 1) {
                alphabets[tempIndex - alphabets.length]
            } else {
                alphabets[tempIndex]
            }
        } else {
            letter
        }
    }
    println(encryptMessage)

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
}