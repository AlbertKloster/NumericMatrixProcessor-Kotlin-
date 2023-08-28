# Stage 6/6: Inverse matrix
## Description
In this stage, you should find the inverse of a matrix.

The inverse matrix $A^−1$ is the matrix whose product with the original matrix $A$ is equal to the identity matrix.
```math
A \times A^{−1}=A^{−1} \times A=I
```

Watch a video about <a href="https://www.youtube.com/watch?v=AMLUikdDQGk">the inverse of a matrix</a> to get the basic idea. To get a deeper understanding, check out the <a href="https://www.youtube.com/watch?v=uQhTuRlWMxw&list=PLZHQObOWTQDPD3MizzM2xVFitgF8hE_ab&index=7">3Blue1Brown channel</a>.

The identity matrix is a matrix where all elements of the main diagonal are ones, and other elements are zeros. Here is an example of a $4,4$ identity matrix:
```math
I_{4,4}=
\begin{pmatrix}
1 & 0 & 0 & 0 \\
0 & 1 & 0 & 0 \\
0 & 0 & 1 & 0 \\
0 & 0 & 0 & 1
\end{pmatrix}
```

The inverse of a matrix can be found using this formula:
```math
A^{-1}= \frac{1}{det(A)} \times C^T
```
As you can see, it contains a lot of operations you implemented in the previous stages: finding cofactors of all the elements of the matrix, transposition of the matrix, finding the determinant of a matrix, and multiplication of a matrix by a constant.

$det(A)$ is the determinant of matrix $A$, and $C^T$ is the matrix consisting of cofactors of all elements of the matrix $A$ transposed along the main diagonal. The inverse matrix can’t be found if $det(A)$ equals zero. You can look up a <a href="https://www.youtube.com/watch?v=xfhzwNkMNg4">calculation example</a>.

## Objectives
In this stage, your program should support finding the inverse of a matrix. Refer to the example to see how it should be implemented.

Note that in some cases the inverse of a matrix does not exist. In such cases, your program should output a warning message.

## Additional improvements
Although it's not required in this stage and we won't check, you can implement a method that prints a matrix in a readable way so that every column is correctly aligned and all elements are rounded to a fixed number of digits.

## Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

<b>Example 1:</b> <i>the user chooses to calculate the inverse of a matrix</i>
```
1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
6. Inverse matrix
0. Exit
Your choice: > 6
Enter matrix size: > 3 3
Enter matrix:
> 2 -1 0
> 0 1 2
> 1 1 0
The result is:
 0.33   0  0.33
-0.33   0  0.66
 0.16 0.5 -0.33

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
6. Inverse matrix
0. Exit
Your choice: >
```
<b>Example 2:</b> <i>the user chooses to calculate the inverse of a matrix; the matrix doesn't have an inverse</i>
```
1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
6. Inverse matrix
0. Exit
Your choice: > 6
Enter matrix size: > 2 2
Enter matrix:
> 2 1
> 4 2
This matrix doesn't have an inverse.

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
6. Inverse matrix
0. Exit
Your choice: > 0
```