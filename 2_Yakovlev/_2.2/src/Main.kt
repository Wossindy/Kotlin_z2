//Создать приложение, которое подсчитывает количество различных символов во введенной строке. Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
//A - 3
//D - 2
//S - 3
fun main() {
    println("Введите строку:")
    val s = readLine() ?: ""

    val x = mutableMapOf<Char, Int>()

    s.forEach {
        x[it] = x.getOrDefault(it, 0) + 1
    }

    println("Результат:")
    x.keys.forEach { char ->
        println("$char - ${x[char]}")
    }
}
