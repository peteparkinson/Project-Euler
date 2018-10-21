"""
Project Euler, problem 15

Starting in the top left corner of a 2×2 grid, and only being
able to move to the right and down, there are exactly 6 routes
to the bottom right corner.

How many such routes are there through a 20×20 grid?

Answer:
((2n)! / n!) / n! = paths
(40! / 20!) / 20! = 137846528820
"""


def factorial(num):
    for x in range(2, num):
        num *= x

    return num


n = 20
answer = (factorial(2 * n) / factorial(n)) / factorial(n)

print(answer)
