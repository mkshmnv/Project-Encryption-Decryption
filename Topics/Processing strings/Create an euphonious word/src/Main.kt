fun main() {
    val word = readln()
    val vowels = "aeiouy"
    var count = 0
    var countVowel = 0
    var countConsonant = 0

    for (element in word) {
        if (vowels.contains(element)) {
            countVowel++
            countConsonant = 0
        } else {
            countConsonant++
            countVowel = 0
        }

        if (countVowel == 3 || countConsonant == 3) {
            count++
            countConsonant = 1
            countVowel = 1
        }
    }
    println(count)
}