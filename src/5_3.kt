/**
 * Created by User on 13 Окт., 2019
 */
fun main() {
    val array2d: Array<Array<String>> = Array(7, { Array(5, { " " }) })
    var i = 0;
    var j = 0;
    while (i < array2d.size) {
        val arrI = array2d[i]
        j = 0
        while (j < arrI.size) {
            if ((i == j) or (j == (arrI.size - i - 1))) {
                arrI[j] = "X"
            }
            j++
        }
        i++
    }
    for (arrI in array2d) {
        for (s in arrI) {
            print(s)
        }
        println()
    }
}