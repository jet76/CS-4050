# Project 31 - Solving Some LP Instances  

For each of the 3 problems below, produce a careful mathematical description of the LP, ready to be put into a data le for use with `ManualSimplex`. Then use the application, noting the values of the basic variables and the objective function at the optimal tableau for both Phase 1 and Phase 2, as appropriate, and describe the final solution to each problem as infeasible, unbounded, or having an optimal feasible point.  

a. Formulate and solve this LP:  

$$max x_1 + 2x_2 + 3x_3$$  

subject to the constraints

$$ -3x_1 + 15x_2 - 3x_3 \geq 3 $$  

$$ 6x_1 + 3x_2 + 6x_3 \leq 60 $$  

$$ -6x_1 + 6x_2 + 3x_3 \leq 21 $$  

$$ 9x_1 + 5x_2 - x_3 \geq 21 $$  

$$ -3x_1 + 5x_2 + 2x_3 \geq 3 $$ 

$$ 6x_1 + 8x_2 - 4x_3 \leq 30 $$  

$$ 8x_2 - 4x_3 \leq 12 $$  

$$ 3x_1 + 3x_3 \geq 12 $$  

$$ x_1; x_2; x_3 \geq 0 $$  

b. Formulate and solve the above LP, but with this constraint added:  

$$ 2x_3 \leq 1 $$  

c. Formulate and solve the LP for part a, but with the first four constraints removed.  
