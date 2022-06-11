# Project 9 - Karatsuba’s Method for Multiplying Integers  

For a new problem/algorithm to tackle by the divide and conquer technique, consider the problem of multiplying two integers symbolically, using ordinary “by hand” techniques.  

Most people (I hope!) had to learn in elementary school an algorithm for multiplying two integers by hand. One version of this algorithm is demonstrated here—each row is produced by multiplying the first number by one digit of the second number, suitably shifted, and then the columns have to be added up:  

$$
&&&&3&1&7&8\cr
\times&&&&5&6&9&4\cr
\hline
&&&1&2&7&1&2\cr
&&2&8&6&0&2\cr
&1&9&6&0&8\cr
1&5&8&9&0\cr
\hline
1&8&0&9&5&5&3&2
$$