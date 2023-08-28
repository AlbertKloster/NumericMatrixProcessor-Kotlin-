package processor

typealias Matrix = List<List<Double>>

enum class Option(val string: String) {
    ADD_MATRICES("1"),
    MULTIPLY_MATRIX_BY_CONSTANT("2"),
    MULTIPLY_MATRICES("3"),
    TRANSPOSE_MATRIX("4"),
    CALCULATE_DETERMINANT("5"),
    INVERSE_MATRIX("6"),
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
            Option.TRANSPOSE_MATRIX -> transposeMatrix()
            Option.CALCULATE_DETERMINANT -> calculateDeterminant()
            Option.INVERSE_MATRIX -> inverseMatrix()
            Option.EXIT -> exit = true
        }
    }
}

private fun inverseMatrix() {
    print("Enter matrix size: ")
    val numRows = getNumRows()
    println("Enter matrix:")
    val matrix = getMatrix(numRows)
    try {
        val result = matrix.inverse()
        printResult(result)
    } catch (e: RuntimeException) {
        println(e.message)
    }
}

private fun calculateDeterminant() {
    print("Enter matrix size: ")
    val numRows = getNumRows()
    println("Enter matrix:")
    val matrix = getMatrix(numRows)
    val result = matrix.calculateDeterminant()
    println("The result is:\n$result")
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
    val constant = readln().toDouble()
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

private fun transposeMatrix() {
    println("""
        
        1. Main diagonal
        2. Side diagonal
        3. Vertical line
        4. Horizontal line
    """.trimIndent())

    print("Your choice: ")
    val choice = readln()
    if (!Regex("[1-4]").matches(choice)) {
        println("Wrong choice $choice")
        return
    }

    print("Enter matrix size: ")
    val numRows = getNumRows()

    println("Enter matrix:")
    val matrix = getMatrix(numRows)

    val result = when (choice) {
        "1" -> matrix.transposeMain()
        "2" -> matrix.transposeSide()
        "3" -> matrix.transposeVertical()
        "4" -> matrix.transposeHorizontal()
        else -> return
    }

    printResult(result)
}

private fun getNumRows() = readln().split(" ").map { it.toInt() }.first()

private fun getMatrix(numRows: Int) = List(numRows) { readln().split(" ").map { it.toDouble() } }

private fun printMenu() {
    println("""
        
        1. Add matrices
        2. Multiply matrix by a constant
        3. Multiply matrices
        4. Transpose matrix
        5. Calculate a determinant
        6. Inverse matrix
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

private fun Matrix.multiply(number: Double) = this.map { row -> row.map { it * number } }

private fun Matrix.multiply(other: Matrix): Matrix {
    val numRowsA = this.size
    val numColsA = this.first().size
    val numRowsB = other.size
    val numColsB = other[0].size

    if(numColsA != numRowsB)
        throw RuntimeException("The operation cannot be performed.")

    val transposedB = other.transposeMain()

    return (0 until numRowsA).map { i ->
        (0 until numColsB).map { j ->
            this[i].zip(transposedB[j]) { a, b -> a * b }.sum()
        }
    }
}

private fun Matrix.transposeMain(): Matrix {
    if (isEmpty()) return emptyList()
    val numRows = this.first().size
    val numCols = size
    val result = MutableList(numRows) { MutableList(numCols) { 0.0 } }
    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = this[j][i]
        }
    }
    return result
}

private fun Matrix.transposeSide(): Matrix {
    if (isEmpty()) return emptyList()
    val numRows = this.first().size
    val numCols = size
    val result = MutableList(numRows) { MutableList(numCols) { 0.0 } }
    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = this[numCols - 1 - j][numRows - 1 - i]
        }
    }
    return result
}

private fun Matrix.transposeVertical(): Matrix {
    if (isEmpty()) return emptyList()
    val numRows = this.first().size
    val numCols = size
    val result = MutableList(numRows) { MutableList(numCols) { 0.0 } }
    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = this[i][numCols - 1 - j]
        }
    }
    return result
}

private fun Matrix.transposeHorizontal(): Matrix {
    if (isEmpty()) return emptyList()
    val numRows = this.first().size
    val numCols = size
    val result = MutableList(numRows) { MutableList(numCols) { 0.0 } }
    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = this[numRows - 1 - i][j]
        }
    }
    return result
}

private fun Matrix.calculateDeterminant(): Double {
    val numRows = this.size
    val numCols = this.first().size
    if (numRows != numCols) throw RuntimeException("The operation cannot be performed.")

    if (numRows == 1) return this.first().first()

    var determinant = 0.0
    for (col in 0 until numCols) {
        determinant += this[0][col] * getCofactor(this, 0, col)
    }

    return determinant
}

fun getCofactor(matrix: List<List<Double>>, row: Int, col: Int): Double {
    val subMatrix = mutableListOf<MutableList<Double>>()

    for (i in matrix.indices) {
        if (i != row) {
            val subRow = mutableListOf<Double>()
            for (j in matrix[i].indices) {
                if (j != col) {
                    subRow.add((matrix[i][j] * if (i % 2 == 0) 1 else -1) * if (j % 2 == 0) 1 else -1)
                }
            }
            subMatrix.add(subRow)
        }
    }

    return subMatrix.calculateDeterminant()
}

private fun Matrix.inverse(): Matrix {
    val numRows = this.size
    val numCols = this.first().size
    if (numRows != numCols) throw RuntimeException("The operation cannot be performed.")

    val determinant = this.calculateDeterminant()

    if (determinant == 0.0) throw RuntimeException("This matrix doesn't have an inverse.")

    val cofactorMatrix = mutableListOf<List<Double>>()
    for (row in 0 until numRows) {
        val cofactorRow = mutableListOf<Double>()
        for (col in 0 until numCols) {
            cofactorRow.add(getCofactor(this, row, col))
        }
        cofactorMatrix.add(cofactorRow)
    }

    return cofactorMatrix.transposeMain().multiply(1 / determinant)
}