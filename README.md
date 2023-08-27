# Stage 2/6: Multiplication by number
## Description
In this stage, you are going to implement the multiplication of a matrix by a constant. To do this, you need to multiply every element of the matrix by that constant. You can see the example below:

```math
C\times
\begin{pmatrix}
a_{1,1} & a_{1,2} && a_{1,3}
a_{2,1} & a_{2,2} && a_{2,3}
\end{pmatrix}
=
\begin{pmatrix}
C\timesa_{1,1} & C\timesa_{1,2} && C\timesa_{1,3}
C\timesa_{2,1} & C\timesa_{2,2} && C\timesa_{2,3}
\end{pmatrix}
```

## Objectives
Write a program that:
1. reads a matrix and a constant,
2. outputs the result of their multiplication.

The first line of the input contains the number of rows and the number of columns of the matrix. The next lines contain rows of the matrix. The last line contains the constant.

The constant and the elements of the matrix are integers.

## Examples
<b>Example 1:</b>

Input:
```
3 3
1 2 3
4 5 6
7 8 9
3
```

Output:
```
3 6 9
12 15 18
21 24 27
```

<b>Example 2:</b>

Input:
```
2 3
1 2 3
4 5 6
0
```

Output:
```
0 0 0
0 0 0
```
