# Project 8 - Average Case Analysis of Quicksort  

To show that occasionally we are interested in the average case behavior for an algorithm, let’s look at the average case behavior of quicksort.  

This project requires you to nicely write up, with all details explained, the entire proof that is sketched below.  

Quicksort is a famous divide-and-conquer algorithm. It is well-known that for any partic-ular strategy for picking the pivot item in the partition algorithm—say picking the first item in the list to be partitioned—quicksort can have worst-case behavior in $\Omega(n^{2})$. So, why does the algorithm continue to find favor? We will present a proof that quicksort has $\Omega(n\ log\ n)$ average-case performance.  

Let $A(n)$ be the average time for quicksort to sort $n$ items and find a recurrence relation for this function, which we will then solve.  

We assume that given $n$ items to partition, all $n$ are equally likely. So,  

$$A(n)=\sum_{p=1}^{n}\frac{1}{n}[A(p-1)+A(n-p)]+n-1$$  

This is true because each of the n possible choices of pivot item location is equally likely, each with a probability of $1/n$, and the partition time is $n−1$ independent of the location of the pivot time, on average, and $A(p − 1)$ and $A(n − p)$ are the average times needed to do the two recursive calls to quicksort on the two sublists produced by the partition.  

Show that

$$\sum_{p=1}^{n}[A(p-1)+A(n-p)]=2\sum_{p=1}^{n}A(p-1)$$  

So,  

$$A(n)=\frac{2}{n}\sum_{p=1}^{n}A(p-1)+n-1$$  

So, we have the relationship  

$$nA(n)=2\sum_{p=1}^{n}A(p-1)+n(n-1)$$  

Now we do a clever technique, using the same relationship with a different index, substituting $n − 1$ for $n$ to obtain  

$$(n-1)A(n-1)=2\sum_{p=1}^{n-1}A(p-1)+(n-1)(n-2)$$  

Then we subtract these two equations, yielding  

$$nA(n)-(n-1)A(n-1)=2A(n-1)+n(n-1)-(n-1)(n-2)=2A(n-1)+2(n-1)$$.  

Verify this algebra.  

Now, tidy things up to yield  

