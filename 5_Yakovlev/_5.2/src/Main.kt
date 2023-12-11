import kotlin.math.pow
import kotlin.math.sqrt

data class Point(val x: Double, val y: Double)

fun calculateDistance(point1: Point, point2: Point): Double {
    val deltaX = point2.x - point1.x
    val deltaY = point2.y - point1.y

    return sqrt(deltaX.pow(2) + deltaY.pow(2))
}

fun main() {
    val point1 = Point(1.0, 2.0)
    val point2 = Point(4.0, 6.0)


    val distance = calculateDistance(point1, point2)


    println("Расстояние между точками: $distance")
}