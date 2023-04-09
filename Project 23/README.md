# Project 23 - 0-1 Knapsack by Dynamic Programming  

Demonstrate the dynamic programming algorithm for the 0-1 knapsack problem on this instance:  

$W = 10$  

<table>
  <tr>
    <td>Item $j$</td><td>$p_j$</td><td>$w_j$</td>
  </tr>
  <tr>
    <td>1</td><td>60</td><td>3</td>
  </tr>
  <tr>
    <td>2</td><td>72</td><td>4</td>
  </tr>
  <tr>
    <td>3</td><td>80</td><td>5</td>
  </tr>
  <tr>
    <td>4</td><td>90</td><td>6</td>
  </tr>
  <tr>
    <td>5</td><td>48</td><td>4</td>
  </tr>
</table>  

You can fill in the entire chart in a sensible order, or work “on demand,” working back recursively from the lower-right corner cell and marking all the cells that will be needed and only filling in them.  

<table>
  <tr>
    <td></td><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td>
  </tr>
  <tr>
    <td>1:<br/><br/><br/></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>2:<br/><br/><br/></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>3:<br/><br/><br/></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>4:<br/><br/><br/></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>5:<br/><br/><br/></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
</table>

## Efficiency Analysis for the 0-1 Knapsack Algorithm  

Analyzing the efficiency of this algorithm is a little confusing, because we have to consider carefully what we mean by the input size, and figure out how many bits are required to specify each of the $n$ $p_i$ and $w_i$ values, as well as the $W$ value.  

It is obvious that for n items and a weight of W, this dynamic programming algorithm takes $\Theta(nW)$, because that is how many cells there are in the chart, and it takes just a few steps to compute each cell, given the cells from the row above. This looks like a trivial problem, but it is not, because for an input size $N$, $W$ is like $2^N$, while $n$ is like $N$ (assuming for simplicity that the $w_i$ and $p_i$ values take a fixed number of bits each), so the efficiency category is $\Theta(N2^N)$ which is viewed as computationally intensive.  

For the “on demand” version of the algorithm, the cells that need to be filled can form a binary tree with $n$ levels, resulting in efficiency in $\Theta(2^n)$, though we haven’t proven that, or related it to $N$.
