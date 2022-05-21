# Project 6 - Solving a Reduce and Conquer Recurrence Relation  

Recall the selection sort algorithm. If we let S(n) be the number of comparisons required to sort n items using selection sort, then it is easy to see that for any k > 1,  

S(k) = k − 1 + S(k − 1) = S(k − 1) + k − 1,  

because it takes k − 1 comparisons to find the minimum of the k items being sorted, and it takes S(k − 1) comparisons to perform selection sort on the rest of the items.  

You job on this problem is to solve this recurrence relation (also using the obvious fact that S(1) = 0). In other words, you need to come up with a non-recursive formula for S(n).  

With k = n, you have  

S(n) = S(n − 1) + n − 1 = [S(n − 2) + (n − 2)] + n − 1 = S(n − 2) + (n − 1) + (n − 2).  

Continue in this way—substitute the recursive formula for k = n − 2, and continue until you see the pattern, and can express S(n) as a sum of terms with no recursive call involved. Then recall some basic math (the sum of 1 + 2 + · · · + n − 1 + n =?) to express the sum as a single algebraic expression.  
