fun main() {
    println("Введите два числа и символ операции (разделите пробелами):")
    val input = readLine()

    if (input != null) {
        try {
            val (number1, number2, operation) = input.split(" ").map { it.toDouble() }
            val result = performOperation(number1, number2, operation)
            println("Результат: $result")
        } catch (e: Exception) {
            println("Ошибка: ${e.message}")
        }
    } else {
        println("Некорректный ввод.")
    }
}

fun performOperation(number1: Double, number2: Double, operation: Char): Double {
    return when (operation) {
        '+' -> number1 + number2
        '-' -> number1 - number2
        '*' -> number1 * number2
        '/' -> number1 / number2
        else -> throw IllegalArgumentException("Некорректный символ операции")
    }
}