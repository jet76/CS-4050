# Project 13 - Computing the Inverse of a Fourier Coefficient Matrix  

We actually need to be able to compute $F_{8}^{−1}y$ to accomplish our original goal (interpolation) and we’ve been talking in all the previous about computing $F_{8}c$. Fortunately, with
these special matrices computing the inverse is super-easy (and takes just $\Theta(n^2)$ time, versus $\Theta(n^3)$ for a general matrix, say using Gaussian elimination).  

It turns out that $F_{n}^{−1}$ can be trivially computed by the simple formula 

$$F^{−1}=\frac{1}{n}\overline{F_n}$$  

where $\overline{F_n}$ is obtained by taking the inverse in the field of each element in $F_n$.  

To prove this for any $n$, assume that $\alpha^{n}=1$, and let $\beta=\alpha^{−1}$. Then row $j$ of $F_n$ is 

$$[\alpha^{j·0} \alpha^{j·1} \ldots \alpha^{jm} \ldots \alpha^{j(n−1)}]$$  

and column $k$ of $\overline{F_n}$ is

$$
\begin{bmatrix}
\beta^{0 \cdot k} \\
\vdots \\
\beta^{m k} \\
\vdots \\
\beta^{(n-1)j}
\end{bmatrix}
$$

so the element of $F_{n}\overline{F_n}$ in row $j$, column $k$ is the usual matrix product of these two matrices, which is
$$\alpha^{j·0}\beta^{0·k} + \alpha^{j·1}\beta^{1·k} + \ldots + \alpha^{jm}\beta^{mk} + \ldots + \alpha^{j(n−1)}\beta^{(n−1)k} = (\alpha^{j}\beta^{k})^0 + (\alpha^{j}\beta^{k})^1 + \ldots + (\alpha^{j}\beta^{k})^m + \ldots + (\alpha^{j}\beta^{k})^{n−1}$$

Now, if we let $r = \alpha^{j}\beta^{k}$, we see that the element is a geometric series, namely

$$1 + r + \ldots + r^{n−1}$$

Now, for elements of the product array not on the diagonal, that is, $k \neq j$, assuming that $\alpha$ and $\beta$ are primitive roots of unity, it is easy to see that $r \neq 1$ (just pair up $\alpha’s$ and $\beta’s$ and cancel them until we get either some left-over $\alpha’s$ or some left-over $\beta’s$, with fewer than $n$, so can’t get to $1$) so (by the formula for the sum of a geometric series) the element is

$$\frac{r^{n} − 1}{r − 1}$$

which is equal to $0$ since

$$r^n = (\alpha^{j}\beta^{k})^{n} = \alpha^{jn}\beta^{kn} = (\alpha^{n})^{j}(\beta^{n})^{k} = 1^{j}1^{k} = 1$$

For elements of the product array on the diagonal, $j = k$, so

$$r = \alpha^{j}\beta^{j} = \alpha^{j}\overline{\alpha}^{j} = (\alpha\overline{\alpha})^{j} = (|\alpha|^{2})^{j} = 1^{j} = 1$$

so the element adds up to $n$.

To verify concretely that the previous discussion is correct, write down the component-wise inverse (obtained by taking the multiplicative inverse of each component) of the matrix $F_8$ from [Project 12](/Project%2012/), and then multiply that matrix times $F_8$ to see that things really work!
