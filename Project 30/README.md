# Project 30 - Brute Force Method for LP  

Demonstrate the brute force method, using the ```ManualSimplex``` application, on this LP (you will need to use a text editor to make a suitable input file for this problem, which is
already in the required format for LP):  

$$max \ \  x1 + 2x_2 + 3x_3 + 3x_4 + 2x_5 + x_6 \ \  subject \  to$$

$$4x_1 + 8x_2 + 3x_3 + 6x_4 + 10x_5 - x_6 = 120$$

$$8x_1 - 4x_2 - 6x_3 - 8x_4 + x_5 + 3x_6 = 24$$

$$12x_1 + 5x_2 - 9x_3 + 6x_4 - 9x_5 + 8x_6 = 360$$

$$x \geq 0$$

List all different ways (order doesn't matter) to choose m basic variables, and for each, use the program to do the row operations, and mark as infeasible, or if it is feasible, write the objective function value. When all have been done, note the optimal choice, and state clearly the values of all the variables and the objection function value for this optimal
choice.
