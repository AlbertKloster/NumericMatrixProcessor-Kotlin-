# Stage 5/6: Determined!
## Description
In this stage, you should write a program that calculates a <b>determinant</b> of a matrix. You can check out some <a href="https://www.youtube.com/playlist?list=PLZHQObOWTQDPD3MizzM2xVFitgF8hE_ab">videos about linear algebra</a> to understand the essence of the determinant and why it is important. To see how to calculate the determinant of any square matrix, watch a video about <a href="https://www.youtube.com/watch?v=KMKd993vG9Q">minors and cofactors</a> and <a href="https://www.youtube.com/watch?v=H9BWRYJNIv4">computing the nxn determinant</a>. Also, here's <a href="https://www.mathsisfun.com/algebra/matrix-determinant.html">nice graphic explanation</a> on minors and cofactors.

A <b>determinant</b> is a single number that can be computed from the elements of a square matrix. There is a classical way to find the determinant of a matrix with an order $<3$.

A determinant of a 2-order matrix is equal to the difference between the product of elements on the main diagonal and the product of elements on the side diagonal:
```math
det
\begin{pmatrix}
a_11 & a_12 \\
a_21 & a_22
\end{pmatrix}
= a_11 \times a_22 - a_12 \times a_21
```
Now let's move on to the minor and the cofactor of a matrix.

Minor(i,j)
of a matrix is the determinant of the submatrix we get from the remaining elements after removing the i row and j column from this matrix.

Below is an example of Minor(2,2)
for matrix A3×3
:

M2,2⎛⎝⎜a1,1a2,1a3,1a1,2a2,2a3,2a1,3a2,3a3,3⎞⎠⎟=det(a1,1a3,1a1,3a3,3)

Cofactor(i,j)
of a matrix is the corresponding Minor(i,j)
multiplied by (−1)i+j
. Notice that the cofactor is always preceded by a positive +
or negative −
sign.

We often need to find the determinant of a matrix of the order greater than 2
. In this case, we have to use expansion by rows or columns where the determinant is equal to a sum of a single row or a single column multiplied by the cofactors of the elements in the corresponding row or column. To do this, you should use a recursive method.

Below is an example of computing the determinant of a matrix of order 4
by first-row expansion, where c
stands for the Cofactor
:

det⎛⎝⎜⎜⎜⎜a1,1a2,1a3,1a4,1a1,2a2,2a3,2a4,2a1,3a2,3a3,3a4,3a1,4a2,4a3,4a4,4⎞⎠⎟⎟⎟⎟=M1,1×c1,1+M1,2×c1,2+M1,3×c1,3+M1,4×c1,4

Objectives
In this stage, your program should support calculating the determinant of a matrix. Refer to the example to see how it should be implemented.

Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

Example 1: the user chooses to calculate determinants of two matrices and quits the program after the operation