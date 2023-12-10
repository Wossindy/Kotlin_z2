fun main() {
    // Ввод двух числовых массивов от пользователя
    val a1 = inputArray("Введите первый массив чисел, разделяя элементы пробелами:")
    val a2 = inputArray("Введите второй массив чисел, разделяя элементы пробелами:")

    // Нахождение пересечения массивов
    val i = findIntersection(a1, a2)

    // Вывод результата
    println("Пересечение массивов: $i")
}

fun inputArray(prompt: String): List<Int> {
    print(prompt)
    val input = readLine()
    val array = input?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()
    return array
}

fun findIntersection(array1: List<Int>, array2: List<Int>): List<Int> {
    val countMap1 = array1.groupingBy { it }.eachCount()
    val countMap2 = array2.groupingBy { it }.eachCount()

    val intersection = mutableListOf<Int>()

    for ((num, count) in countMap1) {
        val minCount = minOf(count, countMap2[num] ?: 0)
        repeat(minCount) {
            intersection.add(num)
        }
    }

    return intersection
}