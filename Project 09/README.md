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
