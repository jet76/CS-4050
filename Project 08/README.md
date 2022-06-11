# Project 8 - Average Case Analysis of Quicksort  

To show that occasionally we are interested in the average case behavior for an algorithm, let’s look at the average case behavior of quicksort.  

This project requires you to nicely write up, with all details explained, the entire proof that is sketched below.  

Quicksort is a famous divide-and-conquer algorithm. It is well-known that for any partic-ular strategy for picking the pivot item in the partition algorithm—say picking the first item in the list to be partitioned—quicksort can have worst-case behavior in $\Omega(n^{2})$. So, why does the algorithm continue to find favor? We will present a proof that quicksort has $\Omega(n\ log\ n)$ average-case performance.  

Let $A(n)$ be the average time for quicksort to sort $n$ items and find a recurrence relation for this function, which we will then solve.  

We assume that given $n$ items to partition, all $n$ are equally likely. So,  

