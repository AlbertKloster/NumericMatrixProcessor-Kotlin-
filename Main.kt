package processor

fun main() {
    val (rows1, _) = readln().split(" ").map { it.toInt() }
    val matrix1 = List(rows1) { readln().split(" ").map { it.toInt() } }

    val number = readln().toInt()

    matrix1.multiply(number).forEach { println(it.joinToString(" ")) }

}


private fun List<List<Int>>.multiply(other: List<List<Int>>): List<List<Int>> {
    if (this.size != other.size || this.first().size != other.first().size)
        throw RuntimeException("ERROR")
    else
        return this.zip(other) { row1, row2 -> row1.zip(row2) { e1, e2 -> e1 + e2 } }
}

private fun List<List<Int>>.multiply(number: Int) = this.map { row -> row.map { it * number } }

