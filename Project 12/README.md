# Project 12 - Exploring FFT  

Your job on this Project is to work through all the previous stuff with a concrete example. Specifically, use $Z_{17}$ as the field for all the numbers, and use $n = 8$. To do this (which I
realized after already printing the earlier comment about $F_8$), we can use $\alpha = 9$.  

For your convenience with this exercise, here are some small multiples of $17$, all of which are equal to $0$ in $Z_{17}$:  

$$0, 17, 34, 51, 68, 85, 102, 119, 136, 153, 170, 187, 204, 221, 234, 255, 272, 289$$  

And, here is the full multiplication table for $Z_{17}$, to save lots of work later:  

$$
\begin{align*}
\  && 0 && 1  && 2  && 3  && 4  && 5  && 6  && 7  && 8  && 9  && 10 && 11 && 12 && 13 && 14 && 15 && 16 \\
0  && 0 && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  && 0  \\
1  && 0 && 1  && 2  && 3  && 4  && 5  && 6  && 7  && 8  && 9  && 10 && 11 && 12 && 13 && 14 && 15 && 16 \\
2  && 0 && 2  && 4  && 6  && 8  && 10 && 12 && 14 && 16 && 1  && 3  && 5  && 7  && 9  && 11 && 13 && 15 \\
3  && 0 && 3  && 6  && 9  && 12 && 15 && 1  && 4  && 7  && 10 && 13 && 16 && 2  && 5  && 8  && 11 && 14 \\
4  && 0 && 4  && 8  && 12 && 16 && 3  && 7  && 11 && 15 && 2  && 6  && 10 && 14 && 1  && 5  && 9  && 13 \\
5  && 0 && 5  && 10 && 15 && 3  && 8  && 13 && 1  && 6  && 11 && 16 && 4  && 9  && 14 && 2  && 7  && 12 \\
6  && 0 && 6  && 12 && 1  && 7  && 13 && 2  && 8  && 14 && 3  && 9  && 15 && 4  && 10 && 16 && 5  && 11 \\
7  && 0 && 7  && 14 && 4  && 11 && 1  && 8  && 15 && 5  && 12 && 2  && 9  && 16 && 6  && 13 && 13 && 10 \\
8  && 0 && 8  && 16 && 7  && 15 && 6  && 14 && 5  && 13 && 4  && 12 && 3  && 11 && 2  && 10 && 1  && 9  \\
9  && 0 && 9  && 1  && 10 && 2  && 11 && 3  && 12 && 4  && 13 && 5  && 14 && 6  && 15 && 7  && 16 && 8  \\
10 && 0 && 10 && 3  && 13 && 6  && 16 && 9  && 2  && 12 && 5  && 15 && 8  && 1  && 11 && 4  && 14 && 7  \\
11 && 0 && 11 && 5  && 16 && 10 && 4  && 15 && 9  && 3  && 14 && 8  && 2  && 13 && 7  && 1  && 12 && 6  \\
12 && 0 && 12 && 7  && 2  && 14 && 9  && 4  && 16 && 11 && 6  && 1  && 13 && 8  && 3  && 15 && 10 && 5  \\
13 && 0 && 13 && 9  && 5  && 1  && 14 && 10 && 6  && 2  && 15 && 11 && 7  && 3  && 16 && 12 && 8  && 4  \\
14 && 0 && 14 && 11 && 8  && 5  && 2  && 16 && 13 && 10 && 7  && 4  && 1  && 15 && 12 && 9  && 6  && 3  \\
15 && 0 && 15 && 13 && 11 && 9  && 7  && 5  && 3  && 1  && 16 && 14 && 12 && 10 && 8  && 6  && 4  && 2  \\
16 && 0 && 16 && 15 && 14 && 13 && 12 && 11 && 10 && 9  && 8  && 7  && 6  && 5  && 4  && 3  && 2  && 1  \\
\end{align*}
$$  

Write here the powers of $9$ in $Z_{17}$ (you’ll need this in the next work):

$$
\begin{align*}
k && 0 && 1 && 2 && 3 && 4 && 5 && 6 && 7 && 8 \\
9^{k} && \ && \ && \ && \ && \ && \ && \ && \ && \ \\
\end{align*}
$$  

Note that all of the following steps were described more abstractly in the previous discussion—all you have to do is go through with concrete numbers in $Z_{17}$ and make sure that you understand everything.  

Define $F_8$ by  

$$(F_8)_{j,k}=9^{jk}$$  

(using $\alpha = 9$, which works because $9^8 = 1$ in $Z_{17}$, and no smaller power of $9$ gives $1$)  

Using the coefficient matrix given on the bottom of page 36 (where $\alpha^8 = 1$ has been used, and the columns and values of $c_j$ have been switched around), fill in all the values in the modified coefficient matrix (noting that all the values in this matrix are available in your chart of the powers of $9$ in $Z_{17}$):  

$$
\left[ 
{\begin{array}{cc}
  a^{0} & a^{0} & a^{0} & a^{0} & a^{0} & a^{0} & a^{0} & a^{0} \\
  a^{0} & a^{2} & a^{4} & a^{6} & a^{1} & a^{3} & a^{5} & a^{7} \\
  a^{0} & a^{4} & a^{0} & a^{4} & a^{2} & a^{6} & a^{2} & a^{6} \\
  a^{0} & a^{5} & a^{4} & a^{2} & a^{3} & a^{1} & a^{7} & a^{5} \\
  a^{0} & a^{0} & a^{0} & a^{0} & a^{4} & a^{4} & a^{4} & a^{4} \\
  a^{0} & a^{2} & a^{4} & a^{6} & a^{5} & a^{7} & a^{1} & a^{3} \\
  a^{0} & a^{4} & a^{0} & a^{4} & a^{6} & a^{2} & a^{6} & a^{2} \\
  a^{0} & a^{5} & a^{4} & a^{2} & a^{7} & a^{5} & a^{3} & a^{1} \\
\end{array} } 
\right] = 
\begin{align*}
\  && 0  && 1  && 2  && 3  && 4  && 5  && 6  && 7  \\
0  && \  && \  && \  && \  && \  && \  && \  && \  \\
1  && \  && \  && \  && \  && \  && \  && \  && \  \\
2  && \  && \  && \  && \  && \  && \  && \  && \  \\
3  && \  && \  && \  && \  && \  && \  && \  && \  \\
4  && \  && \  && \  && \  && \  && \  && \  && \  \\
5  && \  && \  && \  && \  && \  && \  && \  && \  \\
6  && \  && \  && \  && \  && \  && \  && \  && \  \\
7  && \  && \  && \  && \  && \  && \  && \  && \  \\
\end{align*}
$$  

Now you need to show how to compute $F_8$ times a given vector $c$, using the Fast Fourier multiplication idea, using the example (chosen at random):  

$$
c = 
\left[ 
{\begin{array}{cc}
  1  \\
  14 \\
  13 \\
  11 \\
  6  \\
  10 \\
  16 \\
  7  \\
\end{array} } 
\right]
$$  

Let’s digress to think about efficiency a little here. First, how much work is it to form a matrix such as this? There are $n^2$ components, and computing each component takes $\Theta(1)$ work, so it takes $\Theta(n^2) work to form an $n$ by $n$ matrix like this. This might seem prohibitively high, because in a minute we are going to get all happy over the fact that the Fast Fourier multiplication idea drops the work of multiplying a square matrix times a vector from $\Theta(n^2)$ to $\Theta(n log n)$, so doesn’t the fact that it takes $\Theta(n^2)$ to form the matrix in the first place make this improvement negligible?  

It would if we had to form the matrix every time we wanted to do a matrix-vector multiplication, but note that once we pick $\alpha$ and $n $(basically choosing how many uniformly distributed frequencies we want to sample), the coefficient matrix can be formed once and used for any number of different $c$ vectors. It’s like each time you talk for a few seconds, the analog data from that talking gives a $c$, which is then quickly multiplied by the $n$ by $n$ matrix, which was formed once and hard-coded into your cell phone, essentially.  

In concrete terms for this Project, it would take $64$ multiplications (along with the corresponding additions) to compute the matrix-vector product $F_{8}c$. As you proceed with this Project, note that you will be showing how to accomplish the same thing using just $n \log{n} = 8 · 3 = 24$ multiplications.  

By the way, note that we started talking about interpolation, which meant solving $F_{n}c = y$, with $y$ known, to find the polynomial coefficients $c$, but now for convenience we’re considering how to multiply $F_{n}c$ to get $y$. We’ll fix this later.  

Now write out the top-level step, as follows.  

First, looking at the 4 sub-matrices (the dividing lines have been conveniently provided), note that you really have just one 4 by 4 matrix—appearing in the upper left section—with some multiplications.  

Note that the upper left 4 by 4 matrix, which we will denote by $F_4$, also occurs in the lower left 4 by 4 section.  

Carefully write out the details showing that the upper right 4 by 4 matrix can be obtained by taking $F_4$ and multiplying each row, in order, by $\alpha0$, $\alpha1$, and so on. Similarly, show/verify that the lower right 4 by 4 section can be obtained by multiplying the rows by $\alpha4$, $\alpha5$, and so on.  

Now, be careful to rearrange the rows of c in the same way that the columns of $F_8$ were rearranged. Then, write out what calculations need to be done, noting that only two matrix-vector multiplications are needed.  

Back on page 37 we conveniently express the multiplying of the rows of $F_4$ by various powers of $\alpha$ using diagonal matrices, but note that if you have any square matrix $A$, and vector $x$, and any diagonal matrix $D$, then forming $D Ax$ can be done in $\Theta(n^2)$ time, even though general multiplication of two $n$ by $n$ matrices takes $\Theta(n^3)$. This is because we can do $D Ax = D(Ax)$, and note that a diagonal matrix times a vector can be done in $\Theta(n)$ time.  

At this point, if we were willing to perform these two half-size matrix-vector multiplications, we could quickly be done. But, to get the full idea of Fast Fourier multiplication, you should now repeat the entire process for both products, doing to $F_4$ everything that had to be done with $F_8$.  

Figure out the 4 by 4 matrix you need to multiply by two 4-vectors. Then compute the powers of 13 and note that this 4 by 4 matrix, with columns swapped, is $F_4$ according to the formula, with $\alpha = 9^2 = 13$.  

Now apply the formulas for doing the two desired 4 by 4 matrix times 4-vectors efficiently. When you get down to wanting 2 by 2 matrices times 2-vectors, just go ahead and use the traditional slow algorithm (we could sub-divide once more to get down to 1 by 1 matrices times 1-vectors, but let’s not).  

Put it all together and consider your final answer for $F_{8}c$. Compare this result to what you get by doing the “64 multiplications” traditional slow algorithm, and fix any problems that have occurred.
