# Project 9 - Karatsuba’s Method for Multiplying Integers  

For a new problem/algorithm to tackle by the divide and conquer technique, consider the problem of multiplying two integers symbolically, using ordinary “by hand” techniques.  

Most people (I hope!) had to learn in elementary school an algorithm for multiplying two integers by hand. One version of this algorithm is demonstrated here—each row is produced by multiplying the first number by one digit of the second number, suitably shifted, and then the columns have to be added up:  

$
\begin{align*}
   &&&&&&   &&&&&&   &&&&&&   &&&&&& 3 &&&&&& 1 &&&&&& 7 &&&&&& 8 &&&&&&\\
   &&&&&&   &&&&&&   &&&&&&   &&&&&& 5 &&&&&& 6 &&&&&& 9 &&&&&& 4 &&&&&&\\
\hline
   &&&&&&   &&&&&&   &&&&&& 1 &&&&&& 2 &&&&&& 7 &&&&&& 1 &&&&&& 2 &&&&&&\\
   &&&&&&   &&&&&& 2 &&&&&& 8 &&&&&& 6 &&&&&& 0 &&&&&& 2 &&&&&&   &&&&&&\\ 
   &&&&&& 1 &&&&&& 9 &&&&&& 0 &&&&&& 6 &&&&&& 8 &&&&&&   &&&&&&   &&&&&&\\
 1 &&&&&& 5 &&&&&& 8 &&&&&& 9 &&&&&& 0 &&&&&&   &&&&&&   &&&&&&   &&&&&&\\
\hline
 1 &&&&&& 8 &&&&&& 0 &&&&&& 9 &&&&&& 5 &&&&&& 5 &&&&&& 3 &&&&&& 2 &&&&&&
\end{align*}
$
