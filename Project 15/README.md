# Project 15 - Performing Extended Euclidean Algorithm by Hand  

Create the chart for the extended Euclidean algorithm on the instance of the problem "compute gcd( 439, 211 )."  

First work downward, producing $a$, $b$, $r$, and $q$ for each row.  

Then work back up, filling in the columns for $s$ and $t$. For the bottom row, which for our RSA work will always have $a = 1$ and $b = 0$, use $s = 1$ and $t = 0$. Work upward using the formulas

$$s = t'$$  

$$t = s' − t'q$$

where $s'$ and $t'$ are the values in a row, and $s$ and $t$ are the values in the row above.  

Each time you compute $s$ and $t$ for a row, be sure to check that for the values in that row, $sa + tb$ is equal to the final GCD (which will always be 1 for our RSA work).  

After doing this, do it again, but this time use $s = 1$ and $t = 1$ in the bottom row. Note that we can use $s = 1$ and $t = anything$ on the bottom row and still have $sa+tb = 1$, since $b = 0$ on the bottom row. Note how the pattern of alternation reverses. Figure out why this algorithm always gives alternating signs in the $s$ and $t$ columns.  

Note that the class ```GCD``` in the ```RSA``` folder implements this algorithm, using a choice of $s$ and t for the bottom row that produces a positive value for t, as desired for the RSA work (also note that the column labels are different, maintaining $gf + de = 1$ on each row).
