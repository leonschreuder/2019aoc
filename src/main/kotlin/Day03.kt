import kotlin.math.abs

data class Xy(val x: Int, val y: Int)

class Day03 {

    fun calcClosestIntersection(line1: String, line2: String): Int {
        val pointsLine1 = getPoints(line1)
        val pointsLine2 = getPoints(line2)

        var intersecting = mutableListOf<Int>()
        for (cPoint in pointsLine1) {
            if (pointsLine2.contains(cPoint)) {
                println("point:$cPoint=" + (abs(cPoint.x) + abs(cPoint.y)))
                intersecting.add(abs(cPoint.x) + abs(cPoint.y))
                continue
            }
        }
        intersecting.sort()
        println(intersecting)
        return intersecting.first()
    }

    fun getPoints(description: String): List<Xy> {
        val points = mutableListOf<Xy>()
        var x = 0
        var y = 0
        description.split(",").forEach {
            val direction = it.substring(0, 1)
            val amount = it.substring(1).toInt()
            for (i in 1..amount) {
                when {
                    direction == "U" -> y++
                    direction == "D" -> y--
                    direction == "R" -> x++
                    direction == "L" -> x--
                }
                // if (x < 0) x=0
                // if (y < 0) y=0
                points.add(Xy(x, y))
            }
        }
        return points
    }

    fun calcBestSteps(line1: String, line2: String): Int {
        val pointsLine1 = getPoints(line1)
        val pointsLine2 = getPoints(line2)

        val numbSteps = mutableListOf<Int>()
        for (i in 0..pointsLine1.size - 1) {
            val pointL1 = pointsLine1[i]
            for (j in 0..pointsLine2.size - 1) {
                val pointL2 = pointsLine2[j]
                if (pointL1 == pointL2) {
                    numbSteps.add(i+1 + j+1)
                    continue
                }
            }
        }
        numbSteps.sort()
        return numbSteps.first()
    }

}
