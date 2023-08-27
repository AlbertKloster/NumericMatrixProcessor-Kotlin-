# Stage 3/6: Matrix by matrix multiplication
## Description
The next stage is the multiplication of matrices. This operation is a little more complex because it’s not enough to simply multiply the corresponding elements.

Unlike with addition, the sizes of the matrices can be different: the only restriction is that the number of columns in the first matrix should equal the number of rows for the second matrix.

The multiplication of $A$ matrix with $n$ rows and $m$ columns and $B$ matrix with $m$ rows and $k$ columns is $`C_{n,k}=A_{n,m}\times B_{m,k}`$.

The resulting matrix has $n$ rows and $k$ columns, where every element is a sum of the multiplication of $m$ elements across the rows of matrix $A$ by $m$ elements down the columns of matrix $B$.

Another really important thing is that $`A_{i,j} \times B_{j,k}`$ is not equal to $B_{j,k} \times A_{i,j}$. In fact, these are not even possible to multiply if $k \neq i$. If $k=i$, the resulting matrices would still be different.

Take a look at this example of matrix multiplication:
```math
\begin{pmatrix}
1 & 7 & 7 \\
6 & 6 & 4 \\
4 & 2 & 1
\end{pmatrix}
\times
\begin{pmatrix}
3 & 2 & 4 \\
5 & 5 & 9 \\
8 & 0 & 10
\end{pmatrix}
=
\begin{pmatrix}
1 \times 3 + 7 \times 5 + 7 \times 8 & 1 \times 2 + 7 \times 5 + 7 \times 0 & 1 \times 4 + 7 \times 9 + 7 \times 10 \\
6 \times 3 + 6 \times 5 + 4 \times 8 & 6 \times 2 + 6 \times 5 + 4 \times 0 & 6 \times 4 + 6 \times 9 + 4 \times 10 \\
4 \times 3 + 2 \times 5 + 1 \times 8 & 4 \times 2 + 2 \times 5 + 1 \times 0 & 4 \times 4 + 2 \times 9 + 1 \times 10
\end{pmatrix}
=
\begin{pmatrix}
94 & 37 & 137 \\
80 & 42 & 118 \\
30 & 18 & 44
\end{pmatrix}
```

## Objectives
In this stage, you should write a program that can do all operations on matrices that you've learned.

Write a program that does the following:
- Prints a menu consisting of 4 options. The example shows what the menu should look like.
- Reads the user's choice.
- Reads all data (matrices, constants) needed to perform the chosen operation. The example shows the input format in each case.
- Calculates the result and outputs it. The example shows how your output should look like.
- Repeats all these steps.

The program should keep repeating this until the `Exit` option is chosen.

If some operation cannot be performed, output a warning message.

Also, you should support floating-point numbers (<b>Hint:</b> Use Double type to mitigate loss of accuracy in complex calculations).

## Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

<b>Example 1:</b> <i>the user chooses the addition of matrices</i>
```
1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: > 1
   Enter size of first matrix: > 4 5
   Enter first matrix:
> 1 2 3 4 5
> 3 2 3 2 1
> 8 0 9 9 1
> 1 3 4 5 6
> Enter size of second matrix: > 4 5
> Enter second matrix:
> 1 1 4 4 5
> 4 4 5 7 8
> 1 2 3 9 8
> 1 0 0 0 1
> The result is:
> 2 3 7 8 10
> 7 6 8 9 9
> 9 2 12 18 9
> 2 3 4 5 7

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: >
```

<b>Example 2:</b> <i>the user chooses the multiplication of a matrix by a constant</i>
```
1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: > 2
   Enter size of matrix: > 2 2
   Enter matrix:
> 1.5 7.0
> 6.0 5.0
> Enter constant: > 0.5
> The result is:
> 0.75 3.5
> 3.0 2.5

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: >
```

<b>Example 3:</b> <i>the user chooses the multiplication of matrices</i>
```
1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: > 3
   Enter size of first matrix: > 3 3
   Enter first matrix:
> 1 7 7
> 6 6 4
> 4 2 1
> Enter size of second matrix: > 3 3
> Enter second matrix:
> 3 2 4
> 5 5 9
> 8 0 10
> The result is:
> 94 37 137
> 80 42 118
> 30 18 44

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: >
```

<b>Example 4:</b> <i>the user chooses the addition of matrices; the opertaion cannot be performed and they quit the program</i>
```
1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: > 1
   Enter size of first matrix: > 2 2
   Enter first matrix:
> 1 2
> 3 2
> Enter size of second matrix: > 1 1
> Enter second matrix:
> 1
> The operation cannot be performed.

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
0. Exit
   Your choice: > 0
```
