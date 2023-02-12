# Project 11 - The Integers Mod N

This Project has nothing to do with divide-and-conquer, but presents material that you will need to understand for upcoming algorithms, including several that use divide-and-conquer. Define $Z_{n}$ to be the integers where arithmetic is done using this simple rule:  

do the operation (addition, subtraction, and multiplication) as usual, and then reduce the result by doing integer division by n and taking the remainder as the result. This operation is known as “reducing a number ‘mod n’. ”  
  
You may or may not have seen this in your Discrete Math course. We consider two integers as being “the same” if they differ by a multiple of *n*. Note that all integers belong to $Z_{n}$, but we prefer 0 through *n − 1* as representatives. When reduced mod *n*, all integers are seen to be equal to one of these canonical values. This is a lot like fractions — we prefer $\^{1}\_{2}$ to the infinitely many other ways to express this same number as a ratio of two integers, like, say, $\^{17\}_{34}$.  

For example, $Z_{5}$ has the canonical values 0 through 4, with these addition and multiplication tables:  

$$
\begin{align*}
\+&&0&&1&&2&&3&&4&& &&\*&&0&&1&&2&&3&&4\\
0&&0&&1&&2&&3&&4&& &&0&&0&&0&&0&&0&&0\\
1&&1&&2&&3&&4&&0&& &&1&&0&&1&&2&&3&&4\\
2&&2&&3&&4&&0&&1&& &&2&&0&&2&&4&&1&&3\\
3&&3&&4&&0&&1&&2&& &&3&&0&&3&&1&&4&&2\\
4&&4&&0&&1&&2&&3&& &&4&&0&&4&&3&&2&&1
\end{align*}
$$  

Verify some of the values in this table. For any prime number $n$, it turns out that $Z_{n}$ is a field, which is an algebraic entity that satisfies all the algebraic properties of the real numbers that don’t involve comparisons. Note that for every number $x$, there is a number $y$ such that $x+y = 0$, and for every non-zero number $x$, there is a number $z$ that that $xz = 1$. Also, $8x+0 = x$ and $x·1 = x$* for every $x$, so $0$ and $1$ are additive and multiplicative identity elements. Since arithmetic is done as usual, followed by reduction mod $n$, both addition and multiplication satisfy the associative, commutative, and distributive properties.  

Play with these ideas a little more by computing computing, say, $8 · 15$ in $Z_{17}$ (some calculators are fancy enough to reduce a number mod $17$ as a built-in operation, but if not, you can divide the number by $17$, hit $=$, subtract the whole number part, hit $=$, and then multiply by $17$ to get the remainder. Also, when working in $Z_{17}$, it can be useful to start by quickly writing down a bunch of multiples of $17$, namely $17, 34, 51, 68, . . ., 170$. These values are all $0$ in $Z_{17}$, which let’s you quickly reduce numbers by $17$ in your head, like $40 = 6$ because $40 − 34 = 6$)  

Find the number in $Z_{17}$ you can add to $8$ to give $0$ (this number can be referred to as $−8$, but we want it as one of the canonical numbers, i.e, from $0$ through $16$).  

Find the number in $Z_{17}$ you can multiply by $8$ to give $1$. Note that this is considerably harder — later we’ll learn an efficient algorithm for doing it.  

Does $13$ have a square root in $Z_{17} (a number $x$ such that $x^{2} = 13$)? If so, find it.  

It will turn out that there is a very useful pattern for the powers of a given value in $Z_{n}$. To explore this, fill in this table of the various powers of $\alpha = 3$, in $Z_{17}$. Be sure to do this efficiently by noting that $\alpha^{k} = \alpha^{k−1} · \alpha$ for $k ≥ 1$ — do not compute $\alpha^{k}$ in $Z_{17}$ using your calculator and then reduce the result mod $17$ (this approach will, later, quickly overwhelm your calculator, even for relatively small values of $n$):  

$$
\begin{align*}
k && 0 && 1 && 2 && 3 && 4 && 5 && 6 && 7 && 8 && 9 && 10 \\
3^{k}&& && && && && && && && && \\
\end{align*}
$$  

$$
\begin{align*}
k && 11 && 12 && 13 && 14 && 15 && 16 && 17 && 18 && 19 && 20 \\
3^{k}&& && && && && && && && && \\
\end{align*}
$$
