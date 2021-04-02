# Project 4
## Sums to n Problem by Brute Force

Consider the “sums to n problem:” given a positive integer n, list all the different ways to get a collection of positive integers adding up to n. Assume that we don’t care about
order, so 1 + 2 and 2 + 1 are the same possibility.

For n = 3, the possibilities are
1 + 1 + 1, 1 + 2, 3

Your job on this project is to create a Java class that will take n as input and produce a list of all the possibilities (with each item in the list on its own row, with the integers in it in nondecreasing order left to right).

Name the class SumsToN. Submit your work by email with all the `.java` files (should not be very many!) needed for your application attached, and all group members (0 through 2) other than the sender CC’ed.

Note that I want to be able to download your attached source files into a folder, go into that folder and at the command line type

```console
javac SumsToN.java
```
and then type
```console
java SumsTo
```

and have your application ask, at the command prompt, for the value of n, and then print out the list of possibilities—one per line—in the command window.
