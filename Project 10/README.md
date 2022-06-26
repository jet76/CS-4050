# Project 10 - Deriving and Demonstrating Strassen’s Algorithm  

For large $n, \Theta(n^{3})$ can be a lot of work (though we are mostly studying an improved method for practice using divide and conquer, not because Strassen’s algorithm is so useful in practice).  
Consider multiplication of two 2 by 2 matrices:  

$$
\begin{bmatrix}
a & b \\
c & d
\end{bmatrix}
\begin{bmatrix}
e & f \\
g & h
\end{bmatrix}
\=
\begin{bmatrix}
ae+bg & af+bh \\
ce+dg & cf+dh
\end{bmatrix}
$$ 

This algorithm takes 8 multiplications and 4 additions. Strassen’s algorithm is based on the following clever way to get the same result at a cost of 7 multiplications and a bunch of additions, which, when we do the time analysis, turns out to be better asymptotically.  

Of course, to be more efficient, Strassen’s algorithm applies the same idea that we will be deriving recursively. For example, if you wanted to multiply two 1024 by 1024 matrices, $a$ through $h$ would each be 512 by 512 matrices, and Strassen’s algorithm would be applied to compute each 512 by 512 product. To avoid going mildly insane, we will only study the clever algebra for Strassen’s algorithm when $a$ through $e$ are single numbers.  

The idea is to get the 8 scalars such as ae, bg, and so on, by multiplying sums of terms. For example, $(a + b)(e + h) = ae + ah + be + bh$, so at a cost of one multiplication we can get two terms that we want, namely ae and bh. Of course, we need those terms separately, not added together, and not added to the other terms.  

To understand Strassen’s idea, we use a 4 by 4 chart to visualize the terms obtained by a product of this sort. Here, for example, is the chart for $(a+b)(e+h) = ae+ah+be+bh$:  

$$
\begin{center}
\begin{tabular}{ |c|c|c| } 
 \hline
 cell1 & cell2 & cell3 \\ 
 cell4 & cell5 & cell6 \\ 
 cell7 & cell8 & cell9 \\ 
 \hline
\end{tabular}
\end{center}
$$
