package processor

typealias Matrix = List<List<Int>>

fun main() {
    val (rows1, _) = readln().split(" ").map { it.toInt() }
    val matrix1 = List(rows1) { readln().split(" ").map { it.toInt() } }

    val (rows2, _) = readln().split(" ").map { it.toInt() }
    val matrix2 = List(rows2) { readln().split(" ").map { it.toInt() } }

    matrix1.multiply(matrix2).forEach { println(it.joinToString(" ")) }

}

fun Matrix.add(other: Matrix): Matrix {
    if (this.size != other.size || this.first().size != other.first().size)
        throw RuntimeException("ERROR")
    else
        return this.zip(other) { row1, row2 -> row1.zip(row2) { e1, e2 -> e1 + e2 } }
}

fun Matrix.multiply(number: Int) = this.map { row -> row.map { it * number } }

fun Matrix.multiply(other: Matrix): Matrix {
    val numRowsA = this.size
    val numColsA = this[0].size
    val numRowsB = other.size
    val numColsB = other[0].size

    require(numColsA == numRowsB) {
        "Number of columns in matrixA must be equal to the number of rows in matrixB"
    }

    val transposedB = other.transpose()

    return (0 until numRowsA).map { i ->
        (0 until numColsB).map { j ->
            this[i].zip(transposedB[j]) { a, b -> a * b }.sum()
        }
    }
}

fun Matrix.transpose(): Matrix {
    if (isEmpty()) return emptyList()
    val numRows = this[0].size
    val numCols = size
    val result = MutableList(numRows) { MutableList(numCols) { 0 } }
    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = this[j][i]
        }
    }
    return result
}
