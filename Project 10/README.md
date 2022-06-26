# Project 10 - Deriving and Demonstrating Strassen’s Algorithm  

For large $n, \Theta(n^{3})$ can be a lot of work (though we are mostly studying an improved method for practice using divide and conquer, not because Strassen’s algorithm is so useful in practice).  
Consider multiplication of two 2 by 2 matrices:  

$$\begin{bmatrix} \beginalign{a & b \\ c & d} \end{bmatrix} \begin{bmatrix}e & f \\ g & h \end{bmatrix}= \begin{bmatrix} ae+bg & af+bh \\ ce+dg & cf+dh \end{bmatrix}$$  

