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

$Minor_{(i,j)}$ of a matrix is the determinant of the submatrix we get from the remaining elements after removing the $i$ row and $j$ column from this matrix.

Below is an example of $Minor_{(2,2)}$ for matrix $A_{3 \times 3}$:
```math
M_{2,2}
\begin{pmatrix}
a_{1,1} & \textcolor{red}{a_{1,2}} & a_{1,3} \\
\textcolor{red}{a_{2,1}} & \textcolor{red}{a_{2,2}} & \textcolor{red}{a_{2,3}} \\
a_{3,1} & \textcolor{red}{a_{3,2}} & a_{3,3}
\end{pmatrix}
= det
\begin{pmatrix}
a_{1,1} & a_{1,3} \\
a_{3,1} & a_{3,3}
\end{pmatrix}
```
$Cofactor_{(i,j)}$ of a matrix is the corresponding $Minor_{(i,j)}$ multiplied by $(−1)^{i+j}$. Notice that the cofactor is always preceded by a positive $+$ or negative $−$ sign.

We often need to find the determinant of a matrix of the order greater than $2$. In this case, we have to use expansion by rows or columns where the determinant is equal to a sum of a single row or a single column multiplied by the cofactors of the elements in the corresponding row or column. To do this, you should use a recursive method.

Below is an example of computing the determinant of a matrix of order $4$ by first-row expansion, where $c$ stands for the $Cofactor$:
```math
det
\begin{pmatrix}
a_{1,1} & a_{1,2} & a_{1,3} & a_{1,4} \\
a_{2,1} & a_{2,2} & a_{2,3} & a_{2,4} \\
a_{3,1} & a_{3,2} & a_{3,3} & a_{3,4} \\
a_{4,1} & a_{4,2} & a_{4,3} & a_{4,4}
\end{pmatrix}
= M_{1,1} \times c_{1,1} + M_{1,2} \times c_{1,2} + M_{1,3} \times c_{1,3} + M_{1,4} \times c_{1,4}
```
### Objectives
In this stage, your program should support calculating the determinant of a matrix. Refer to the example to see how it should be implemented.

## Example
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

<b>Example 1:</b> <i>the user chooses to calculate determinants of two matrices and quits the program after the operation</i>
```
1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
0. Exit
Your choice: > 5
Enter matrix size: > 3 3
Enter matrix:
> 1 7 7
> 6 6 4
> 4 2 1
The result is:
-16

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
0. Exit
Your choice: > 5
Enter matrix size: > 5 5
Enter matrix:
> 1 2 3 4 5
> 4 5 6 4 3
> 0 0 0 1 5
> 1 3 9 8 7
> 5 8 4 7 11
The result is:
191

1. Add matrices
2. Multiply matrix by a constant
3. Multiply matrices
4. Transpose matrix
5. Calculate a determinant
0. Exit
Your choice: > 0
```