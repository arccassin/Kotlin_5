import kotlin.random.Random

/**
 * Created by User on 13 Окт., 2019
 */

fun main() {
    val arr: Array<Double> = Array(30, { Random.nextDouble(32.0, 40.0) })
    var average = 0.0
    var validCount = 0
    for (i in arr) {
        average += i
        if ((i > 36.2) and (i < 36.9)) {
            validCount++
        }
    }
    average /= arr.size
    println("Average temperature = $average")
    println("Valid count = $validCount")
}