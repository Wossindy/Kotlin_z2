import kotlin.math.abs

data class Point(val x: Double, val y: Double)

fun barycentricCoordinates(p: Point, a: Point, b: Point, c: Point): Triple<Double, Double, Double> {
    val denominator = (b.y - c.y) * (a.x - c.x) + (c.x - b.x) * (a.y - c.y)
    val alpha = ((b.y - c.y) * (p.x - c.x) + (c.x - b.x) * (p.y - c.y)) / denominator
    val beta = ((c.y - a.y) * (p.x - c.x) + (a.x - c.x) * (p.y - c.y)) / denominator
    val gamma = 1.0 - alpha - beta
    return Triple(alpha, beta, gamma)
}

fun pointT(p: Point, a: Point, b: Point, c: Point): Boolean {
    val (alpha, beta, gamma) = barycentricCoordinates(p, a, b, c)
    return alpha >= 0 && alpha <= 1 && beta >= 0 && beta <= 1 && gamma >= 0 && gamma <= 1
}

fun main() {
    val a = Point(0.0, 0.0)
    val b = Point(4.0, 0.0)
    val c = Point(2.0, 3.0)

    val point = Point(2.0, 1.0)

    // Проверка
    val Triangle = pointT(point, a, b, c)

    if (Triangle) {
        println("Точка находится внутри треугольника.")
    } else {
        println("Точка находится вне треугольника.")
    }
}
