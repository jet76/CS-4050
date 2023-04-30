# Project 26 - Solving TSP by Dynamic Programming

Consider this instance of TSP:  

<table>
  <tr>
    <td></td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td>
  </tr>
  <tr>
    <td>1</td><td>0</td><td>8</td><td>3</td><td>4</td><td>7</td>
  </tr>
  <tr>
    <td>2</td><td>9</td><td>0</td><td>2</td><td>5</td><td>10</td>
  </tr>
  <tr>
    <td>3</td><td>3</td><td>11</td><td>0</td><td>4</td><td>9</td>
  </tr>
  <tr>
    <td>4</td><td>7</td><td>8</td><td>12</td><td>0</td><td>5</td>
  </tr>
  <tr>
    <td>5</td><td>12</td><td>9</td><td>6</td><td>7</td><td>0</td>
  </tr>
</table>

Create the dynamic programming chart for this instance, as described previously, and use it to solve this instance.  

The entire algorithm is based on the definition of $D[A][j]$, which is the cost of the best path that starts at vertex $j$, passes through each vertex in $A$ exactly once, and ends up at vertex 1.

For example, let’s work through computing $D[\\{ 2, 3, 5\\}][4]$:  

We have three choices for where to go first from vertex 4, namely 2, 3, or 5. For each of these choices, we can find the cost, almost, from cells in the chart that have already been filled in. For example, the best path if we go from 4 to 2 costs  

$$w_{41} + D[\\{3, 5 \\}][2],$$

because $D[\\{3, 5\\}][2]$ is the cost of the best way to start at 2, pass through 3 and 5 exactly once, and then go to 1. We can do the same calculation for first going to 3, or first going to 5, and pick the best of these three paths to give the value for $D[\\{2, 3, 5\\}][4]$.  

If you get frustrated, you can use ```DynProgTSP``` to help—but be sure you can do these chart values by hand.
