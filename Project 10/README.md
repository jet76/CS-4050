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

INSERT IMAGE HERE  

Strassen figured out that if we use these quantities involving the four original numbers:  
$$m1 = (a + d)(e + h),$$
$$m2 = (c − a)(e + f),$$
$$m3 = (b − d)(g + h),$$

then we can form $m_1+m_3$ and $m_1+m_2$ and then find four terms with one original number times the sum of two others, like $(a + b)h$, and can finally form the 4 desired elements of the matrix product at a cost of just 7 multiplications.  

Do all the following work to finish creating Strassen’s algorithm (or some minor variation of Strassen’s algorithm). Please do not look anything up on the internet—that won’t help you with whatever variation of the following work I might decide to put on Test 1!  

The “deliverable” to be checked for this Project will be your formulas that produce the four expressions needed for 2 by 2 matrix multiplication in only 7 multiplications, along with your demonstration of using the formulas, checked against the traditional approach.  

Using the tables provided below, you can, with a little cleverness, figure out the details of Strassen’s Algorithm.  

Fill in the + and − symbols in these charts for the 4 target expressions in the matrix product—the ones we need for our final answer:  

INSERT IMAGES HERE  

---  

Now fill in the symbols for the three key products figured out by Strassen, namely $m_1$, $m_2$, and $m_3$:  

INSERT IMAGES HERE

Fill in the symbols for the two suggested sums:  

INSERT IMAGES HERE  

Here are some charts for figuring out the remaining 4 products we are allowed (with some extra for trial and error):  

INSERT IMAGES HERE  

Now, write down (somewhere you can cherish them forever, or at least until Test 1 is over) formulas for the four target expressions using sums and differences of just the 7 quantities you have found using 7 multiplications.  

Also, verify that your formulas use 18 additions/subtractions of matrices of size $n/2$ along with 7 multiplications, which shows that the recurrence relation given in Project 7 for the number of additions in Strassen’s algorithm is correct.  

Demonstrate your formulas to compute

$$
\begin{bmatrix}
5 & 7 \\
4 & 2
\end{bmatrix}
\cdot
\begin{bmatrix}
9 & 1 \\
3 & 6
\end{bmatrix}
$$  

Be sure to check your result against the traditional algorithm so you can catch any errors in your formulas or process.

