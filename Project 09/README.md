# Project 9 - Karatsuba’s Method for Multiplying Integers  

For a new problem/algorithm to tackle by the divide and conquer technique, consider the problem of multiplying two integers symbolically, using ordinary “by hand” techniques.  

Most people (I hope!) had to learn in elementary school an algorithm for multiplying two integers by hand. One version of this algorithm is demonstrated here—each row is produced by multiplying the first number by one digit of the second number, suitably shifted, and then the columns have to be added up:  

$$
\begin{align*}
   &&   &&   &&   && 3 && 1 && 7 && 8 \\
\times   &&   &&   &&   && 5 && 6 && 9 && 4 \\
\hline
   &&   &&   && 1 && 2 && 7 && 1 && 2 \\
   &&   && 2 && 8 && 6 && 0 && 2 &&   \\ 
   && 1 && 9 && 0 && 6 && 8 &&   &&   \\
 1 && 5 && 8 && 9 && 0 &&   &&   &&   \\
\hline
 1 && 8 && 0 && 9 && 5 && 5 && 3 && 2 
\end{align*}
$$  

If we decide to use as our representative operation—the one we count—the action of multiplying two digits—it is easy to see that the traditional algorithm has efficiency in $\Theta(n^2)$.  

According to Levitin, in 1960 Anatoly Karatsuba developed a more efficient algorithm for this elementary school problem! We will now develop this algorithm using the divide and conquer technique.  

Karatsuba used the divide and conquer idea of thinking about this multiplication not as a bunch of digit by digit products, but as a number of half-size problems. He approached the problem of multiplying two $n$-digit numbers by the strategy of doing some $n/2$ multiplication problems and then adding.  

Specifically, suppose that $x$ and $y$ are $n$-digit numbers, and you want to form $xy$ (the multiplication operator is often omitted as usual in algebra). So, we break $x$ into its first $n/2$ digits, $a$, and its last $n/2$ digits $b$ (assuming that n is even for convenience), then $x = 10^{n/2}a+b$, and similarly $y = 10^{n/2}c+d$, where all of $a$, $b$, $c$, and $d$ are $n/2$ digits long.  

For our earlier example, this idea means to compute  

$$(31 · 100 + 78) · (56 · 100 + 94)$$  

Now, by simple algebra,  

$$xy = (10^{n/2}a + b) · (10^{n/2}c + d) = ac10^n + (ad + bc)10^{n/2} + bd,$$  

which shows that $xy$ can be formed by doing four multiplications of size $n/2$, and then doing a bunch of shifting and adding. Note that we will ignore adding because adding two $n$ digit numbers takes time proportional to $n$, whereas multiplication takes time proportional to $n^2$, so the work of adding is negligible, probably. Shifting is also cheaper than adding.  

We can analyze the efficiency of this algorithm by letting $T(n)$ be the number of single digit multiplications needed to multiply together two n digit integers, and noting that  

$$T(n) = 4T(n/2)$$  

for the algorithm we have just designed.  

In your group, use Project 7 to say what efficiency category this algorithm is in.  

But, Karatsuba went on to notice something clever, namely that he could form the product of two n digits numbers by doing only three half-size multiplications. Instead of computing the 4 products $ac$, $ad$, $bc$, and $bd$, we can instead begin by computing $p_1 = (a+b) · (c+d)$ (an apparently mildly insane action). Then we go ahead and compute $p_2 = ac$ and $p_3 = bd$, and, after only 3 size $n/2$ multiplications, we have enough information to compute $xy$.  

Here is the crucial idea for Karatsuba’s method: multiply out the quantity $p_1 = (a+b)(c+d)$ and figure out how you can use $p1$, $p2$, and $p3$ to obtain the 4 products needed for the traditional algorithm (at a cost of only 3 products, and some extra additions and shiftings).  

Work out our first example using this idea—just show how you can compute $3178 · 5694$ using just three two-digit by two-digit multiplications, combined with some shifting and adding (or subtracting).
