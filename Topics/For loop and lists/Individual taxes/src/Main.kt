fun main() {
    val companyCoint = readln().toInt()
    val companyIncome = MutableList(companyCoint) { readln().toDouble() }
    val companyTax = MutableList(companyCoint) { readln().toDouble() }

    var maxTaxes = 0.0
    var numberCompany = 0

    for (index in 0 until companyCoint) {
        val taxes = companyIncome[index] * (companyTax[index] / 100)

        if (maxTaxes < taxes) {
            maxTaxes = taxes
            numberCompany = index + 1
        }
    }
    println(numberCompany)
}