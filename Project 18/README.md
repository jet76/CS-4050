# Project 18 - Computing $mP$ efficiently  

Demonstrate the efficient algorithm for computing 19P using elliptic curve $y^2 = x^3 + 2x + 3$, over $Z_{17}$, and base point $P = (2, 7)$.  

You should do this Project by hand/calculator, but note that the ```Code``` folder at the course web site contains a folder ```ECC``` that contains some classes that could be
used to do this computation.  

For your convenience, here are the $Z_{17}$ multiplication table and a bunch of multiples of $17$:  

$$
\begin{array}
\_ & 0  & 1  & 2  & 3  & 4  & 5  & 6  & 7  & 8  & 9  & 10 & 11 & 12 & 13 & 14 & 15 & 16 \\
0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  & 0  \\
1  & 0  & 1  & 2  & 3  & 4  & 5  & 6  & 7  & 8  & 9  & 10 & 11 & 12 & 13 & 14 & 15 & 16 \\
2  & 0  & 2  & 4  & 6  & 8  & 10 & 12 & 14 & 16 & 1  & 3  & 5  & 7  & 9  & 11 & 13 & 15 \\
3  & 0  & 3  & 6  & 9  & 12 & 15 & 1  & 4  & 7  & 10 & 13 & 16 & 2  & 5  & 8  & 11 & 14 \\
4  & 0  & 4  & 8  & 12 & 16 & 3  & 7  & 11 & 15 & 2  & 6  & 10 & 14 & 1  & 5  & 9  & 13 \\
5  & 0  & 5  & 10 & 15 & 3  & 8  & 13 & 1  & 6  & 11 & 16 & 4  & 9  & 14 & 2  & 7  & 12 \\
6  & 0  & 6  & 12 & 1  & 7  & 13 & 2  & 8  & 14 & 3  & 9  & 15 & 4  & 10 & 16 & 5  & 11 \\
7  & 0  & 7  & 14 & 4  & 11 & 1  & 8  & 15 & 5  & 12 & 2  & 9  & 16 & 6  & 13 & 3  & 10 \\
8  & 0  & 8  & 16 & 7  & 15 & 6  & 14 & 5  & 13 & 4  & 12 & 3  & 11 & 2  & 10 & 1  & 9  \\
9  & 0  & 9  & 1  & 10 & 2  & 11 & 3  & 12 & 4  & 13 & 5  & 14 & 6  & 15 & 7  & 16 & 8  \\
10 & 0  & 10 & 3  & 13 & 6  & 16 & 9  & 2  & 12 & 5  & 15 & 8  & 1  & 11 & 4  & 14 & 7  \\
11 & 0  & 11 & 5  & 16 & 10 & 4  & 15 & 9  & 3  & 14 & 8  & 2  & 13 & 7  & 1  & 12 & 6  \\
12 & 0  & 12 & 7  & 2  & 14 & 9  & 4  & 16 & 11 & 6  & 1  & 13 & 8  & 3  & 15 & 10 & 5  \\
13 & 0  & 13 & 9  & 5  & 1  & 14 & 10 & 6  & 2  & 15 & 11 & 7  & 3  & 16 & 12 & 8  & 4  \\
14 & 0  & 14 & 11 & 8  & 5  & 2  & 16 & 13 & 10 & 7  & 4  & 1  & 15 & 12 & 9  & 6  & 3  \\
15 & 0  & 15 & 13 & 11 & 9  & 7  & 5  & 3  & 1  & 16 & 14 & 12 & 10 & 8  & 6  & 4  & 2  \\
16 & 0  & 16 & 15 & 14 & 13 & 12 & 11 & 10 & 9  & 8  & 7  & 6  & 5  & 4  & 3  & 2  & 1  
\end{array}
$$  
  
$$ \\ $$
  
$$0, 17, 34, 51, 68, 85, 102, 119, 136, 153, 170, 187, 204, 221, 234, 255, 272, 289, 306, 323, 340$$
