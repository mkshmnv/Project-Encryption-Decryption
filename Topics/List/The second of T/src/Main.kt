fun solution(names: List<String>): Int {
    for (i in 1..names.size step 2) {
        if (names[i][0] == 'T') {
            return i
        }
    }
    throw Exception("Should not happen")
}