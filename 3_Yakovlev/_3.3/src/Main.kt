fun main() {
    println("Выберите действие:")
    println("1. Зашифровать текст")
    println("2. Расшифровать текст")

    val c = readLine()?.toIntOrNull()

    when (c) {
        1 -> {
            val plainText = readLine()?.toUpperCase()
            val keyword = readLine()?.toUpperCase()

            if (plainText != null && keyword != null) {
                val encryptedText = processText(plainText, keyword, true)
                println("Зашифрованный текст: $encryptedText")
            } else {
                println("Некорректный ввод.")
            }
        }
        2 -> {
            val cipherText = readLine()?.toUpperCase()
            val keyword = readLine()?.toUpperCase()

            if (cipherText != null && keyword != null) {
                val decryptedText = processText(cipherText, keyword, false)
                println("Расшифрованный текст: $decryptedText")
            } else {
                println("Некорректный ввод.")
            }
        }
        else -> println("Некорректный выбор.")
    }
}

fun processText(text: String, keyword: String, encrypt: Boolean): String {
    val result = StringBuilder()
    var keywordIndex = 0
    val shiftDirection = if (encrypt) 1 else -1

    for (char in text) {
        if (char in 'А'..'Я') {
            val shift = keyword[keywordIndex % keyword.length] - 'А' + shiftDirection
            val processedCharIndex = (char - 'А' + shift + 33) % 33
            result.append('А' + processedCharIndex)
            keywordIndex++
        } else {
            result.append(char)
        }
    }

    return result.toString()
}