# Project 27 - The Sequence Alignment Problem
In this project you will be asked to develop a dynamic programming approach to a new problem, given the key observations.

Note that this Project will require you to create a Java application that solves the sequence alignment problem. All of the following material is suggested pencil-and-paper work to do to prepare yourself to create the program.

Consider the problem of aligning two strings so that they match as well as possible. This problem arises in genetics, where a sequence of molecules named A, C, G, and T form a piece of DNA. As time goes on and various mutations happen, causing symbols to change, to be removed, or to be inserted, two formerly identical sequences in the population of a species become different, but not all that different.

Apparently the model developed here is actually used by biologists.

As an example instance of the problem, suppose we have the sequences AACAGTTACC and TAAGGTCA and we want to align them so that as many symbols as possible match up. We could simply shift them against each other and try to find the shift so that as many symbols as possible match up, but the biology suggests that instead we should allow ourselves to insert any number of gaps, denoted by -, in each sequence, and try in this way to get lots of pairs of symbols to match up. We need a score for any given pair of sequences, with gaps inserted, so we can decide which is better, so we say that if two actual symbols don’t match, we are penalized 1 point, and if an actual symbol is matched with a gap, then we are penalized 2 points.

For example, if we insert some gaps in our sequences, like so:  
\- A A C A G T T A C C  
T A A - G G T - - C A  
we would be penalized 8 points for the 4 actual symbols that are paired up with gaps, and 2 points for the 2 pairs of actual symbols that don’t match, for a score of 10.

Or, if we inserted gaps like this  
A A C A G T T A C C  
T A A G G T - - C A  
we would have a penalty of 4 for the two actual symbols that are paired with gaps, and a penalty of 4 for the four pairs of mismatched actual symbols, for a score of 8, so this alignment beats the first one.

We can now state the sequence alignment problem: given two strings of actual symbols, find a way to insert gaps that produces the smallest score. 

Now we will state the key recursive connection between the original problem and subproblems with the same structure, and you will be asked to figure out the algorithm from this idea.

Consider strings *x<sub>0</sub>x<sub>1</sub>x<sub>2</sub>...x<sub>m−1</sub>* and *y<sub>0</sub>y<sub>1</sub>y<sub>2</sub>...y<sub>n−1</sub>* for positive integers *m* and *n*. The key recursive idea is simply to look at all possible decisions for the first pair of symbols, and then recursively figure out the optimal way to arrange the rest.

First, we might put gaps in both strings in the first position. This would be silly, making no progress—leaving us with the same problem we started with as the sub-problem to be solved:

*− x<sub>0</sub> x<sub>1</sub> ··· x<sub>m−1</sub>  
− y<sub>0</sub> y<sub>1</sub> ··· y<sub>n−1</sub>*

Or, we might chose to pair up *x<sub>0</sub>* and *y<sub>0</sub>*:

*x<sub>0</sub> x<sub>1</sub> ··· x<sub>m−1</sub>  
y<sub>0</sub> y<sub>1</sub> ··· y<sub>n−1</sub>*

This would produce a penalty of 0 or 1, depending on whether x0 = y0. Then, we would recursively decide how to best insert gaps in x1x2 . . . xm−1 and y1y2 . . . yn−1, and add whatever best penalty is obtained for that subproblem to 0 or 1.

Or, we could chose to insert a gap in the first string, matching it with *y<sub>0</sub>*:

*− x<sub>0</sub> x<sub>1</sub> ··· x<sub>m−1</sub>  
y<sub>0</sub> y<sub>1</sub> y<sub>2</sub> ··· y<sub>n−1</sub>*

for a penalty of 2, leaving us to recursively solve the sub-problem of optimally inserting gaps in *x<sub>0</sub>x<sub>1</sub> ... x<sub>m−1</sub>* and *y<sub>1</sub>y<sub>2</sub> ... y<sub>n−1</sub>*.

Similarly, we could chose to insert a gap in the second string, matching it with *x<sub>0</sub>*:

*x<sub>0</sub> x<sub>1</sub> ··· x<sub>m−1</sub>  
− y<sub>0</sub> y<sub>1</sub> ··· y<sub>n−1</sub>*

for a penalty of 2, and recursively solve the sub-problem of optimally inserting gaps in *x<sub>1</sub>x<sub>2</sub> ... x<sub>m−1</sub>* and *y<sub>0</sub>y<sub>1</sub> ... y<sub>n−1</sub>*.

Now, we could simply implement this algorithm using recursion directly, but as usual, this would lead to sub-problems being solved repeatedly and a high degree of inefficiency, so as usual we look to build a table holding solutions to all the appropriate sub-problems. To do this, we simply note that the sub-problems we are talking about above, and the original problem, all have the same form, namely “find the optimal way to insert gaps in *x<sub>i</sub> ... x<sub>m−1</sub>* and *y<sub>j</sub> ... y<sub>n−1</sub>*, where *0 &leq; i < m* and *0 &leq; j &leq; n*.

So, we create a grid of cells, one for each pair of values i and j, like so, for the given problem:  
<table>
  <tr>
    <td></td>
    <td>T</td>
    <td>A</td>
    <td>A</td>
    <td>G</td>
    <td>G</td>
    <td>T</td>
    <td>C</td>
    <td>A</td>
    <td>-</td>
  </tr>
  <tr>
    <td>A</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>A</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>C</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>A</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>G</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>T</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>T</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>A</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>C</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>C</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>-</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>

where we have added an extra gap at the end of each string to provide a convenient way to put the base cases in the chart. For consistency we say that matching two gaps has a penalty of 0.

Now you need to figure out how to compute the value in each cell in terms of already filled-in cells.

Here is a diagram showing the cell to be filled in, namely *A(i, j)* (“A” for alignment?), and some neighboring cells. Figure out a precise description (formula, algorithm, or whatever) for how to compute *A(i, j)* using the values in relevant neighboring cells, which as always with dynamic programming represent simpler sub-problems than *A(i, j)*.
<table>
  <tr>
    <td> </td>
    <td colspan="3" align="center">j</td>
  </tr>
  <tr>
    <td rowspan="3">i</td>
    <td>i<sub>0</sub>j<sub>0</sub></td>
    <td>i<sub>0</sub>j<sub>1</sub></td>
    <td>i<sub>0</sub>j<sub>2</sub></td>
  </tr>
  <tr>
    <td>i<sub>1</sub>j<sub>0</sub></td>
    <td>i<sub>1</sub>j<sub>1</sub></td>
    <td>i<sub>1</sub>j<sub>2</sub></td>
  </tr>
  <tr>
    <td>i<sub>2</sub>j<sub>0</sub></td>
    <td>i<sub>2</sub>j<sub>1</sub></td>
    <td>i<sub>2</sub>j<sub>2</sub></td>
  </tr>
 </table>

! Now, use your description to fill in all the cells in the chart below. Note that you will
need to fill in base case cells “from scratch,” that is, not using the same number of cells
as the general case. In addition to writing the score in each cell, you must draw an arrow
or otherwise indicate which of the three possible decisions is made to produce the optimal
score for the cell.
-
C
C
A
T
T
G
A
C
A
A
T A A G G T C A -
! Once the chart is filled in, write down the optimal way of aligning the two sequences, and
verify that the penalty is correct.
! Demonstrate (draw your own tidy chart) your dynamic programming algorithm for the
instance of the sequence alignment problem with the sequences GACATATTAC and
AACGTAGAC. Fill in the chart and clearly state the optimal insertion of gaps that gives the
optimal score.
All of the preceding work was preparation for the actual work of this Project, which is to
create a Java application that will solve the sequence alignment problem.
Specifically, create a Java application that will ask the user to enter two strings, will
generate and fill in the dynamic programming chart and display it, and will then display
in a nice way exactly how the gaps should be optimally inserted and report the optimal
score.
Submit your work by email as usual, with all your Java source files attached.
