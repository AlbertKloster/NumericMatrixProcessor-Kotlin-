package processor

fun main() {
    val (rows1, columns1) = readln().split(" ").map { it.toInt() }
    val matrix1 = List(rows1) { readln().split(" ").map { it.toInt() } }

    val (rows2, columns2) = readln().split(" ").map { it.toInt() }
    val matrix2 = List(rows2) { readln().split(" ").map { it.toInt() } }

    if (rows1 != rows2 || columns1 != columns2) {
        println("ERROR")
    } else {
        val sum = matrix1.zip(matrix2) { row1, row2 -> row1.zip(row2) { e1, e2 -> e1 + e2 } }
        sum.forEach { println(it.joinToString(" ")) }
    }

}
