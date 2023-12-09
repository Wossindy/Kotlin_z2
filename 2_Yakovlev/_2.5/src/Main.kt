//Создать приложение, с помощью которого пользователь, введя целое число n и основание степени x узнает,
//существует ли целочисленный показатель степени y для которого выполняется равенство xy = n. В случае,
//если показатель существует – вычислить его и вывести.
//В противном случае вывести текст – «Целочисленный показатель не существует».
fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull()

    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull()

    if (n != null && x != null && x > 0) {
        val e = (0..n).find { Math.pow(x.toDouble(), it.toDouble()).toInt() == n }

        if (e != null) {
            println("Целочисленный показатель степени: $e")
        } else {
            println("Целочисленный показатель не существует")
        }
    } else {
        println("Некорректный ввод. Введите положительные целые числа.")
    }
}