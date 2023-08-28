# Stage 4/6: Transpose
## Description
In this stage, you should implement matrix transposition. Matrix transposition is an operation in linear algebra that replaces rows with columns and returns a new matrix as a result. This is an operation on just a single matrix.

The <b>main diagonal</b> of a matrix is a line with elements from $a_{1,1}$ to $a_{n,n}$:
```math
\begin{pmatrix}
\textcolor{red}{a_{1,1}} & a_{1,2} \\
a_{2,1} & a_{2,2}
\end{pmatrix}
```

The side diagonal of a matrix is a line from a1,n
to an,1
:

In math, there is only one type of matrix transposition: transposition along the main diagonal. In this stage, you should implement the other three types of transposition to practice your list skills. These four types are:

transposition along the main diagonal
transposition along the side diagonal
transposition along the vertical line
transposition along the horizontal line
Transposition along the main diagonal is shown below:

Here is what transposition along the side diagonal looks like:

The matrix below is transposed along the vertical line:

Finally, here is transposition along the horizontal line:

Objectives
In this stage, you should add an option to transpose square matrices. If the user chooses this option, your program should provide them with 4 types of transposition and ask them to choose one. Then it should read the matrix, transpose it, and output the result. Refer to the example to see the exact format.

Note that your program should still be able to do all operations on matrices that you've implemented in the previous stage.

Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: the user chooses the matrix transposition and quits the program after the operation

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
0. Exit
   Your choice: > 4

1. Main diagonal
2. Side diagonal
3. Vertical line
4. Horizontal line
   Your choice: > 1
   Enter matrix size: > 3 3
   Enter matrix:
> 1 7 7
> 6 6 4
> 4 2 1
> The result is:
> 1 6 4
> 7 6 2
> 7 4 1

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
0. Exit
   Your choice: > 0