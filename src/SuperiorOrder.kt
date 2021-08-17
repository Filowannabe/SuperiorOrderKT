fun <T> operation(array: List<Int>, fn: (Int) -> T) {
    print("For this list $array we got this results\n")
    array.forEach { print("$it -> ${fn(it)} ,") }
}


fun proofPrimeNumber(value: Int): Boolean {
    for (i in 2..(value / 2)) {
        if (value == 0 || value == 1 || value == 4) return false
        if (value % 2 == 0) return false
    }
    return true
}

fun getFibonacciPosition(value: Int): String {
    var counter = 0
    var position = -1
    var amount = 0
    var current = 1
    var before = 0
    while (position == -1) {
        amount = current + before
        before = current

        current = amount
        counter++
        if (current == value) position = (counter + 1)
        if (current > value) break
    }
    val result = if (position == -1) "No existe en la susecion" else position.toString()
    return result
}

fun main(parametro: Array<String>) {
    val testArray = listOf(21, 2, 3, 4, 5, 6, 7, 8, 9, 10, 34)

    print("1. Proof numbers are prime\n")
    operation(testArray, ::proofPrimeNumber)
    print("\n\n1.Get fibonacci position\n")
    operation(testArray, ::getFibonacciPosition)
}