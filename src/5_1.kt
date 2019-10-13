import java.util.function.Consumer

/**
 * Created by User on 13 Окт., 2019
 */

fun main(){
    val text = "Каждый охотник желает знать, где сидит фазан"
    var colors = text.split(Regex(",?\\s+"))
    for (color in colors){
        println(color);
    }

    println()
    colors = colors.reversed();
    colors.forEach({s: String -> println(s)})
}