import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    // Инициализация двумерного массива 5x5
    val array = Array(5) { IntArray(5) }

    // Ввод элементов массива
    println("Введите элементы массива 5x5:")
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            print("Элемент $i,$j: ")
            array[i][j] = s.nextInt()
        }
    }

    // Проверка на симметрию относительно главной диагонали
    val i = checkSymmetry(array)
    // Вывод результата
    if (i) {
        println("Массив симметричен относительно главной диагонали.")
    } else {
        println("Массив не симметричен относительно главной диагонали.")
    }
}

// Функция для проверки симметрии относительно главной диагонали
fun checkSymmetry(array: Array<IntArray>): Boolean {
    val r = array.size
    val c = array[0].size

    for (i in 0 until r) {
        for (j in 0 until c) {
            if (array[i][j] != array[j][i]) {
                return false
            }
        }
    }
    return true
}