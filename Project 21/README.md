# Project 21 - Change-Making  

When a cashier (human or machine) makes change, usually they want to use the smallest number of coins to make up the given amount. Inspired by this, we define the change-making problem to be:  

given integer denominations $1 = d_1 < d_2 < \ldots < d_n$ of coins in some culture, and an amount A, find the smallest number of coins of these denominations (of course allowing any number of any denomination) that add up to $A$.  

A sample instance of this problem is  

“if $d_1 = 1$ (as always or we might not even have a way to make change for some amounts), $d_2 = 5, d_6 = 6$, find the smallest way to make the amount $A = 16$.”  

Try out solving this instance by using the brute force technique—draw a possibilities tree with each node showing a list of coins used and the total of those coins. Require the coins in the list to be in non-increasing order, like 5, 2, 2, 1, 1, 1. Prune nodes as cleverly as you can (note that if you have found a way to make the target amount using, say, 5 coins, then you can prune all nodes that are going to take more than 5 coins), and circle nodes that are the solutions.  

This is a good time to introduce the *greedy approach*—an algorithm design technique that occasionally works based on “make the next decision to be locally optimal.” For the change-making problem, the greedy approach is to reason “we want to use as few coins as possible, so whenever we have to decide what denomination of coin to choose next, we should always choose the largest denomination we can.”  

It turns out that for standard coins, say in the U.S. (and probably in any culture), the greedy approach works!  

Apply the greedy approach to the previous instance of the change-making problem (with coins 1, 5, and 6, and amount 16). Does this proposed algorithm give the correct answer?  

How about with amount 10?  

Now let’s use the dynamic programming design technique to invent an algorithm for the change-making problem that is more efficient than brute force, but, unlike the greedy approach, correct!  

The idea is to assume that you have a chart giving an optimal (smallest number of coins) way to create every amount smaller than $A$. Specifically, suppose that the cell with index $j$ contains the optimal number of coins to produce the amount $j$, and has a list of coins (in increasing order, say) that achieves that amount.  

With that comforting chart in hand, your only decision—to figure out how to fill in cell $A$—is “which of the possible coins should I choose, to be followed by an optimal list of coins from the chart for the corresponding sub-problem.”  

So, imagine that you have the chart for $N$, with every cell filled except for $N[16]$. Realizing that your choices are to choose 1, 5, or 6, figure out which cells of the chart you need to use, and say exactly how you would use the contents of those cells to determine what should go in cell 16.  

N
<table>
  <tr>
    <td>0</td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td><td>16</td>
  </tr>
  <tr>
    <td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td>?</td>
  </tr>
</table>

Formalize your algorithm (for these three denominations) by writing down a formula suitable for putting in code:  

$N[j] =$  

where on the right-hand side you can use any values of $N[k]$ for $k < j$.  

For notational convenience, assume that $N[k] = \infty$ for any $k$ that does not actually exist, which is $k < 0$ for this chart.  

Apply this formula to iteratively fill in the entire chart (up to 16). Note that as usual with recursion, you will need to solve the base case problem(s) from scratch, since they can’t be solved by using recursive calls to simpler problems. Put in each cell the optimal number of coins at the top, followed by a vertical (just so it fits) list of that many coins that produce the amount for the cell.  

N
<table>
  <tr>
    <td>0</td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td><td>16</td>
  </tr>
  <tr>
    <td><br/><br/><br/><br/></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
</table>
  
