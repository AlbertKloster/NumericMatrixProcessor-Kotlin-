# Stage 4/6: Transpose
## Description
In this stage, you should implement matrix transposition. Matrix transposition is an operation in linear algebra that replaces rows with columns and returns a new matrix as a result. This is an operation on just a single matrix.

The <b>main diagonal</b> of a matrix is a line with elements from $a_{1,1}$ to $a_{n,n}$:
```math
\begin{pmatrix}
\textcolor{red}{a_{1,1}} & a_{1,2} & a_{1,3} & a_{1,4} \\
a_{2,1} & \textcolor{red}{a_{2,2}} & a_{2,3} & a_{2,4} \\
a_{3,1} & a_{3,2} & \textcolor{red}{a_{3,3}} & a_{3,4} \\
a_{4,1} & a_{4,2} & a_{4,3} & \textcolor{red}{a_{4,4}}
\end{pmatrix}
```
The <b>side diagonal</b> of a matrix is a line from $a_{1,n}$ to $a_{n,1}$:
```math
\begin{pmatrix}
a_{1,1} & a_{1,2} & a_{1,3} & \textcolor{red}{a_{1,4}} \\
a_{2,1} & a_{2,2} & \textcolor{red}{a_{2,3}} & a_{2,4} \\
a_{3,1} & \textcolor{red}{a_{3,2}} & a_{3,3} & a_{3,4} \\
\textcolor{red}{a_{4,1}} & a_{4,2} & a_{4,3} & a_{4,4}
\end{pmatrix}
```
In math, there is only one type of matrix transposition: transposition along the main diagonal. In this stage, you should implement the other three types of transposition to practice your list skills. These four types are:
- transposition along the main diagonal
- transposition along the side diagonal
- transposition along the vertical line
- transposition along the horizontal line

Transposition along the main diagonal is shown below:
```math
\begin{pmatrix}
1 & 1 & 1 & 1 \\
2 & 2 & 2 & 2 \\
3 & 3 & 3 & 3 \\
4 & 4 & 4 & 4
\end{pmatrix}^T
\to
\begin{pmatrix}
1 & 2 & 3 & 4 \\
1 & 2 & 3 & 4 \\
1 & 2 & 3 & 4 \\
1 & 2 & 3 & 4
\end{pmatrix}
```
Here is what transposition along the side diagonal looks like:
```math
\begin{pmatrix}
1 & 1 & 1 & -1 \\
2 & 2 & 2 & -2 \\
3 & 3 & 3 & -3 \\
4 & 4 & 4 & -4
\end{pmatrix}^T
\to
\begin{pmatrix}
-4 & -3 & -2 & -1 \\
4 & 3 & 2 & 1 \\
4 & 3 & 2 & 1 \\
4 & 3 & 2 & 1
\end{pmatrix}
```
The matrix below is transposed along the vertical line:
```math
\begin{pmatrix}
1 & 2 & 3 & 4 \\
5 & 6 & 7 & 8 \\
9 & 10 & 11 & 12 \\
13 & 14 & 15 & 16
\end{pmatrix}^T
\to
\begin{pmatrix}
4 & 3 & 2 & 1 \\
8 & 7 & 6 & 5 \\
12 & 11 & 10 & 9 \\
16 & 15 & 14 & 13
\end{pmatrix}
```
Finally, here is transposition along the horizontal line:
```math
\begin{pmatrix}
1 & 2 & 3 & 4 \\
5 & 6 & 7 & 8 \\
9 & 10 & 11 & 12 \\
13 & 14 & 15 & 16
\end{pmatrix}^T
\to
\begin{pmatrix}
13 & 14 & 15 & 16 \\
9 & 10 & 11 & 12 \\
5 & 6 & 7 & 8 \\
1 & 2 & 3 & 4
\end{pmatrix}
```
## Objectives
In this stage, you should add an option to transpose square matrices. If the user chooses this option, your program should provide them with 4 types of transposition and ask them to choose one. Then it should read the matrix, transpose it, and output the result. Refer to the example to see the exact format.

Note that your program should still be able to do all operations on matrices that you've implemented in the previous stage.

## Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

<b>Example 1:</b> <i>the user chooses the matrix transposition and quits the program after the operation</i>
```
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
The result is:
1 6 4
7 6 2
7 4 1

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
0. Exit
Your choice: > 0
```
