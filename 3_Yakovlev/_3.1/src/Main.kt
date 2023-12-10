import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введите количество строк: ")
    val r = scanner.nextInt()
    print("Введите количество столбцов: ")
    val c = scanner.nextInt()

    val array = Array(r) { IntArray(c) }// Инициализация двумерного массива

    // Ввод трехзначных чисел в массив и подсчет различных цифр
    val d = mutableSetOf<Int>()

    println("Введите трехзначные числа:")
    for (i in 0 until r) {
        for (j in 0 until c) {
            val x = scanner.nextInt()
            array[i][j] = x
            // Подсчет различных цифр
            var n = x
            while (n > 0) {
                d.add(n % 10)
                n /= 10
            }
        }
    }

    // Вывод массива и количество различных цифр
    println("\nВведенный массив:")
    for (row in array) {
        for (num in row) {
            print("$num\t")
        }
        println()
    }

    println("\nВ массиве использовано ${d.size} различных цифр.")
}