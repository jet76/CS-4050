  
# Project 2 - Hamiltonian Circuit by Brute Force  

Suppose we have a directed graph with *n* vertices labeled 1 through *n*, implemented using an *n* by *n* matrix where row *j*, column *k* contains true or false (or any other convenient notation) and says whether there is an edge in the graph from vertex *j* to vertex *k*.  

The Hamiltonian circuit problem is to determine whether we can start at vertex 1 and travel along edges of the graph, ending up back at vertex 1 after hitting each other vertex exactly once (and to say the order of vertices in such a circuit, if there is one).  

Figure out how to use the brute force technique to solve an instance of this problem, and demonstrate your algorithm on this matrix (where 0 means no edge and 1 means there is an edge):  

$$
\begin{bmatrix}
0 & 1 & 1 & 0 & 1\\
0 & 0 & 1 & 1 & 0\\
0 & 1 & 0 & 0 & 1\\
1 & 1 & 1 & 0 & 0\\
0 & 1 & 0 & 1 & 0\\
\end{bmatrix}
$$
