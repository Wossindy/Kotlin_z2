import kotlin.math.sqrt

data class Point(val x: Double, val y: Double)

fun calculateDistance(point1: Point, point2: Point): Double {
    val deltaX = point2.x - point1.x
    val deltaY = point2.y - point1.y
    return sqrt(deltaX * deltaX + deltaY * deltaY)
}

fun findMinMaxDistances(points: List<Point>): Pair<Double, Double> {
    require(points.size > 1) { "Количество точек должно быть больше двух" }

    var minDistance = Double.MAX_VALUE
    var maxDistance = Double.MIN_VALUE

    for (i in 0 until points.size - 1) {
        for (j in i + 1 until points.size) {
            val distance = calculateDistance(points[i], points[j])
            minDistance = minOf(minDistance, distance)
            maxDistance = maxOf(maxDistance, distance)
        }
    }

    return minDistance to maxDistance
}

fun main() {
    print("Введите количество точек (больше двух): ")
    val n = readLine()?.toIntOrNull() ?: 0

    if (n <= 2) {
        println("Некорректное количество точек.")
        return
    }

    val points = mutableListOf<Point>()

    repeat(n) {
        print("Введите координаты точки $it (x y): ")
        val (x, y) = readLine()?.split(" ")?.map { it.toDouble() } ?: return
        points.add(Point(x, y))
    }

    val (minDistance, maxDistance) = findMinMaxDistances(points)

    println("Минимальное расстояние между точками: $minDistance")
    println("Максимальное расстояние между точками: $maxDistance")
}