# Project 25 - Designing an Algorithm by Dynamic Programming  

Now that you have explored using dynamic programming to solve some relatively simple problems, it is time for you to practice designing the algorithm on your own. This project gives you the opportunity to do that.  

Consider the following simple game: given a list of positive integers $v_1$ through $v_n$, such as  

$$3, 1, 7, 5, 8, 4$$  

two players take turns picking either the first or the last value in the list and removing that value from the list. The goal for each player is to pick items whose values add up to the maximum possible.  

Your job on this project is to design, using the dynamic programming technique as detailed in the following, an algorithm to solve this problem.  

Begin by playing the game a few times, with the given example and with new instances you make up.  

Here is the idea on which you must base your algorithm: build a 2D chart where row $j$, column $k$ holds the optimal score a player who is faced with $v_j$ through $v_k$ can achieve (assuming that both players play optimally, following the chart—if one player makes a sub-optimal move, then the other can move in the chart to the game they now face and proceed from there).  

In addition to storing the optimal score in each cell, you must also put in either $F$ or $L$, telling the player which move to make—take the First item or the Last item—when faced with this game.  

You will be asked to redo this project if you do not exactly follow the definition of the chart just given. The point is not to solve the problem, but rather to design the solution using dynamic program in a specific way.  

Note that some cells of this chart will not be filled in because they do not represent a valid game situation.  

Your main job is to figure out precisely how you can fill the cell at $(j, k)$ assuming that all the cells for sub-problems have been filled.  

A secondary job is to figure out which cells represent bases cases, and how to fill them “from scratch.”  

When you are ready to have your work checked, I will give you a new instance of the problem for which you will be asked to create the chart.  

Remember, this is an exercise in applying the dynamic programming technique given the key recursive idea, so I will not accept work that does not follow the suggested approach!
