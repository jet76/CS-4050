# Project 22 - The Rocks Game  

This Project will give you the opportunity to apply the dynamic programming design technique to the problem of playing a simple game, known as the **Rocks Game**.  

Here is a game perhaps played long ago by cave people: make two piles of smallish (so they’re easy to handle) rocks. We’ll call these piles “pile A” and “pile B” and say that pile A has m rocks and pile B has n rocks. Two players take turns making moves. The possible moves are:  

- take one rock from pile A
- take one rock from pile B
- take one rock from pile A and one rock from pile B  

The player who takes the last rock or rocks on their turn wins the game.  

Play the game a few times to get a feel for it. We’ll use Lego bricks instead of rocks, but the game is the same. Use 7 rocks in pile A and 8 rocks in pile B.  

Now come up with an algorithm for determining which player can win when faced with two given piles as follows.  

Given non-negative integers $m$ and $n$, build a chart where the cell in row $j$, column $k$ represents the sub-problem:  

“what’s the optimal move for a player faced with $j$ rocks in pile $A$ and $k$ rocks in pile $B$”  

where $0 <= j <= m$ and $0 <= k <= n$.  

Write in each cell information telling a player what to do when faced with the situation given by the cell, namely A or B meaning to take a rock from pile A or pile B, respectively, or 2 meaning to take a rock from both piles, or Q meaning to quit because you can’t win.  

As with all dynamic programming algorithms, you will need to figure out the crucial idea: if all the relevant cells have been filled in, except for the one your are trying to fill in, how do you decide what to do—that is, what symbol to write in the current cell. If you can figure that out, and can figure out how to handle the *base cases*, you should be able to fill in the chart.  

To start, fill in this chart, representing a game that starts with 7 rocks in pile A and 8 rocks in pile B:  

<table>
  <tr>
    <td></td><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td>
  </tr>
  <tr>
    <td>0</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>1</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>2</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>3</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>4</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>4</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>5</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>6</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
  <tr>
    <td>7</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
  </tr>
</table>
