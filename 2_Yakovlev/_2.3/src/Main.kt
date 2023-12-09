//Создать приложение, которое преобразует введенное пользователем
//натуральное число из 10-ичной системы в двоичную.
fun main() {
    println("Введите натуральное число в десятичной системе:")
    val u = readLine()

    try {
        val decimalNumber = u?.toInt() ?: throw NumberFormatException("Некорректный ввод")

        val binaryRepresentation = Integer.toBinaryString(decimalNumber)

        println("Двоичное представление: $binaryRepresentation")
    } catch (e: NumberFormatException) {
        println("Ошибка: Введите корректное натуральное число.")
    }
}