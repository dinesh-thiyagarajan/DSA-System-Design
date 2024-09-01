package DSA.MathBasics

fun main() {
    println("Please enter a integer")
    val input = readln().toInt()
    val output = countDigits(input)
    println(output)
}

/**
 * X = X / 10 formula will remove the last digit of an integer, we do this continuously until we reach zero
 * First iteration for 100/10 quotient will be 10
 * Second iteration for 10/10 quotient will be 1
 * Third iteration for 1/10 quotient will be 0
 */
fun countDigits(input: Int): Int {
    var data = input
    var counter = 0
    while (data > 0) {
        data = data / 10
        counter++
    }
    return counter
}