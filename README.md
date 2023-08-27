# Stage 3/6: Matrix by matrix multiplication
## Description
The next stage is the multiplication of matrices. This operation is a little more complex because it’s not enough to simply multiply the corresponding elements.

Unlike with addition, the sizes of the matrices can be different: the only restriction is that the number of columns in the first matrix should equal the number of rows for the second matrix.

The multiplication of $A$ matrix with $n$ rows and $m$ columns and $B$ matrix with $m$ rows and $k$ columns is $`C_{n,k}=A_{n,m}\mult B_{m,k}`$
.

The resulting matrix has n
rows and k
columns, where every element is a sum of the multiplication of m
elements across the rows of matrix A
by m
elements down the columns of matrix B
.

Another really important thing is that Ai,j×Bj,k
is not equal to Bj,k×Ai,j
. In fact, these are not even possible to multiply if k≠i.
If k=i
, the resulting matrices would still be different.

Take a look at this example of matrix multiplication:

⎛⎝⎜164762741⎞⎠⎟×⎛⎝⎜3582504910⎞⎠⎟=⎛⎝⎜1×3+7×5+7×86×3+6×5+4×84×3+2×5+1×81×2+7×5+7×06×2+6×5+4×04×2+2×5+1×01×4+7×9+7×106×4+6×9+4×104×4+2×9+1×10⎞⎠⎟=⎛⎝⎜94803037421813711844⎞⎠⎟

Objectives
In this stage, you should write a program that can do all operations on matrices that you've learned.

Write a program that does the following:

Prints a menu consisting of 4 options. The example shows what the menu should look like.

Reads the user's choice.

Reads all data (matrices, constants) needed to perform the chosen operation. The example shows the input format in each case.

Calculates the result and outputs it. The example shows how your output should look like.

Repeats all these steps.

The program should keep repeating this until the "Exit" option is chosen.

If some operation cannot be performed, output a warning message.

Also, you should support floating-point numbers (Hint: Use Double type to mitigate loss of accuracy in complex calculations).

Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: the user chooses the addition of matrices

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
   Example 2: the user chooses the multiplication of a matrix by a constant

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
   Example 3: the user chooses the multiplication of matrices

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
   Example 4: the user chooses the addition of matrices; the opertaion cannot be performed and they quit the program

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