//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
//На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
//То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу
fun main() {
    println("Введите строку:")
    val s = readLine() ?: ""

    val c = buildString {
        var z = s[0]
        var x = 1

        s.drop(1).forEach {
            when (it) {
                z -> x++
                else -> {
                    append(z)
                    if (x > 1) append(x)
                    z = it
                    x = 1
                }
            }
        }

        append(z)
        if (x > 1) append(x)
    }

    println("Результат сжатия: $c")
}