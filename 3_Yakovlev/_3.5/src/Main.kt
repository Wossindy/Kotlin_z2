fun main() {
    // Ввод массива слов от пользователя
    val w = inputWords()

    // Группировка слов по признаку "состоят из одинаковых букв"
    val g = groupWords(w)

    // Вывод результата
    println("Группы слов:")
    g.forEach { group ->
        println(group.joinToString(", "))
    }
}

fun inputWords(): List<String> {
    print("Введите массив слов, разделяя слова пробелами: ")
    val input = readLine()
    return input?.split(" ")?.map { it.toLowerCase() } ?: emptyList()
}

fun groupWords(words: List<String>): List<List<String>> {
    val x = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        val s = word.toCharArray().sorted().joinToString("")
        x.getOrPut(s) { mutableListOf() }.add(word)
    }

    return x.values.toList()
}