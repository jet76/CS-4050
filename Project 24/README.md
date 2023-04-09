# Project 24 - Implementing Floyd’s Algorithm

Implement Floyd’s algorithm in a Java application exactly following our ideas(please, of course, do not download source code for Floyd’s algorithm and turn it in as your own work—that would officially be cheating!). If your work is unnecessarily complicated or does not use precisely the input format specified, or does not produce exactly the output requested, I will not accept it.

Test your application on some sample directed graphs.

Your program must get from the keyboard the defining information for a directed graph, in precisely this order: number of vertices, followed by the weights, row by row and column by column, where −1 is used to indicate that there is no edge between the two vertices. You must use 0 for the diagonal weights (leaving out this meaningless weightt is a bad idea because it messes up the formatting).

I will actually use a data file for my test cases and redirect input. Here is the correct data file for the example:  
5  
0 1 -1 1 5  
9 0 3 2 -1  
-1 -1 0 4 -1  
-1 -1 2 0 3  
3 -1 -1 -1 0

Then the program must display, preferably nicely formatted, the successive tables D<sup>0</sup>, D<sup>1</sup>, ..., D<sup>n</sup>, with &infin; indicated as a dash, and each cell containing both the optimal length and the intermediate vertex, if any, that produces it (if the optimal length is just an edge, use 0 as the intermediate vertex).

When you are satisfied with your work, email me with one file as an attachment, with all group members CC’d as usual.

Your main class should be named Floyd. Be careful of going overboard on unnecessarily complex object-orientation—this assignment can trivially be done using one class, or at most two.

If your entire application consists of ```Floyd.java``` send me that. Or, if your application uses more than one class, attach them all. If you use an IDE, be sure to remove any non-portable extra stuff.
