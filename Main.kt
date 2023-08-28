package processor

typealias Matrix = List<List<Double>>

enum class Option(val string: String) {
    ADD_MATRICES("1"),
    MULTIPLY_MATRIX_BY_CONSTANT("2"),
    MULTIPLY_MATRICES("3"),
    EXIT("0");

    companion object {
        fun getOption(input: String): Option {
            for (option in Option.values()) {
                if (option.string == input) return option
            }
            throw RuntimeException("Wrong input: $input")
        }
    }
}

fun main() {
    var exit = false
    while (!exit) {
        printMenu()
        print("Your choice: ")
        when (Option.getOption(readln())) {
            Option.ADD_MATRICES -> addMatrices()
            Option.MULTIPLY_MATRIX_BY_CONSTANT -> multiplyMatrixByConstant()
            Option.MULTIPLY_MATRICES -> multiplyMatrices()
            Option.EXIT -> exit = true
        }
    }
}

private fun addMatrices() {
    println("Enter size of first matrix: ")
    val numRowsA = getNumRows()
    println("Enter first matrix: ")
    val matrixA = getMatrix(numRowsA)
    print("Enter size of second matrix: ")
    val numRowsB = getNumRows()
    println("Enter second matrix: ")
    val matrixB = getMatrix(numRowsB)
    try {
        val result = matrixA.add(matrixB)
        printResult(result)
    } catch (e: RuntimeException) {
        println(e.message)
    }

}

private fun multiplyMatrixByConstant() {
    print("Enter size of matrix: ")
    val numRows = getNumRows()
    println("Enter matrix:")
    val matrix = getMatrix(numRows)
    print("Enter constant: ")
    val constant = readln().toInt()
    val result = matrix.multiply(constant)
    printResult(result)
}

private fun multiplyMatrices() {
    print("Enter size of first matrix: ")
    val numRowsA = getNumRows()
    println("Enter first matrix:")
    val matrixA = getMatrix(numRowsA)
    print("Enter size of second matrix: ")
    val numRowsB = getNumRows()
    println("Enter second matrix:")
    val matrixB = getMatrix(numRowsB)
    try {
        val result = matrixA.multiply(matrixB)
        printResult(result)
    } catch (e: RuntimeException) {
        println(e.message)
    }
}

private fun getNumRows() = readln().split(" ").map { it.toInt() }.first()

private fun getMatrix(numRows: Int) = List(numRows) { readln().split(" ").map { it.toDouble() } }

private fun printMenu() {
    println("""
        
        1. Add matrices
        2. Multiply matrix by a constant
        3. Multiply matrices
        0. Exit
    """.trimIndent())
}

private fun printResult(result: Matrix) {
    println("The result is:")
    result.forEach { println(it.joinToString(" ")) }
}

private fun Matrix.add(other: Matrix): Matrix {
    if (this.size != other.size || this.first().size != other.first().size)
        throw RuntimeException("The operation cannot be performed.")
    return this.zip(other) { row1, row2 -> row1.zip(row2) { e1, e2 -> e1 + e2 } }
}

private fun Matrix.multiply(number: Int) = this.map { row -> row.map { it * number } }

private fun Matrix.multiply(other: Matrix): Matrix {
    val numRowsA = this.size
    val numColsA = this[0].size
    val numRowsB = other.size
    val numColsB = other[0].size

    if(numColsA != numRowsB)
        throw RuntimeException("The operation cannot be performed.")

    val transposedB = other.transpose()

    return (0 until numRowsA).map { i ->
        (0 until numColsB).map { j ->
            this[i].zip(transposedB[j]) { a, b -> a * b }.sum()
        }
    }
}

private fun Matrix.transpose(): Matrix {
    if (isEmpty()) return emptyList()
    val numRows = this[0].size
    val numCols = size
    val result = MutableList(numRows) { MutableList(numCols) { 0.0 } }
    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = this[j][i]
        }
    }
    return result
}
