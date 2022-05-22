# Project 7 - Solving a Divide and Conquer Recurrence Relation  

In our upcoming work on algorithms designed using the divide and conquer technique, we will see that the number of representative operations *T(n)* for an instance of size *n* will be defined in terms of recursive calls to the same function *T*. For example, here are some efficiency functions for algorithms you have already seen, or will see:  

<pre>
T(n) = T(n/2) + 1   (binary search)  
T(n) = 2T(n/2) + n  (merge sort)  
T(n) = 3T(n/2) + n  (Karatsuba’s algorithm)  
T(n) = 7T(n/2)  (Strassen’s algorithm—multiplications)  
T(n) = 7T(n/2) + 18(n/2)<sup>2</sup>  (Strassen’s algorithm—additions)  
</pre>  

In view of these recurrence relations, and with other possibilities in mind, we want to solve, by the substitution technique, any recurrence relation of the form  

T(n) = aT(n/b) + cn<sup>d</sup>,  

where, to keep things nice, we will only consider n that are powers of b (typically b = 2, but it is easy to consider any b > 1), i.e., n = b<sup>m</sup>, and a, c, and d are constants. Your task is to solve this recurrence relation (assume that T(1) is a known number). To get you started:  


T(n) = T(b<sup>m</sup>) = aT(b<sup>m−1</sup>) + c(b<sup>m</sup>)<sup>d</sup> = aT(b<sup>m−1</sup>) + cb<sup>md</sup> = aT(b<sup>m−1</sup>) + c(b<sup>d</sup>)<sup>m</sup> = aT(b<sup>m−1</sup>) + cp<sup>m</sup>  

where we use p = b<aup>d</sup> for convenience.  

Now, we substitute this recurrence in for T(b<sup>m−1</sup>), obtaining  

T(b<sup>m</sup>) = a[aT(b<sup>m−2</sup>) + cp<sup>m−1</sup>] + cp<sup>m</sup> = a<sup>2</sup>T(b<sup>m−2</sup>) + c(a<sup>1</sup>p<sup>m−1</sup> + a<sup>0</sup>p<sup>m</sup>).  

Continue in this way for a few more terms, until you see the pattern. Then extrapolate (you could do math induction to proof your conclusion, but we won’t bother) to obtain a formula for *T(b<sup>m</sup>)* that doesn’t include any calls to *T* (since *T*(1) is a known constant). This formula will include a sum of terms.  

Now, solve each of the specific recurrence relations given by plugging in the values for *a*, *b*, *c*, and *d* and adding up the sum in each case.  

Once you have done the algebra, state carefully, in terms of *n* (not *m*) the $\Theta$ efficiency category for the function *T*.
