import kotlin.random.Random

fun User(): String {
    println("Выберите вариант:")
    println("1. Камень\n2. Ножницы\n3. Бумага")
    print("Ваш выбор (введите соответствующую цифру): ")
    return readLine().toString()
}

fun Computer(): String {
    return (1..3).random().toString()
}

fun Win(u: String, c: String): String {
    println("\nВы выбрали: $u")
    println("Компьютер выбрал: $c")

    return when {
        u == c -> "Ничья!"
        (u == "1" && c == "2") || (u == "2" && c == "3") || (u == "3" && c == "1") -> "Вы победили!"
        else -> "Вы проиграли!"
    }
}

fun main() {
    println("Добро пожаловать в игру 'Камень-Ножницы-Бумага'!\n")

    var p: Boolean
    do {
        val u = User()
        val c = Computer()

        val r = Win(u, c)
        println(r)

        p = (r == "Ничья")
        if (p) {
            println("Давайте сыграем еще раз!\n")
        }
    } while (p)
}