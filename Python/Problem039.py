"""
Project Euler, problem 39

If p is the perimeter of a right angle triangle with integral length sides,
{a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p <= 1000, is the number of solutions maximized?

answer = 840;  //correct
"""

import math

perimSolutions = []
answer = 0

for x in range(1000):
    perimSolutions.append(0)

for p in range(1, 1001):

    for a in range(1, int((p/2) + 1)):
        for b in range(a + 1, int((p /2) + 1)):
            c = math.sqrt(a*a + b*b)
            if a + b + c == p:
                print(a, ", ", b, ", ", c )
                perimSolutions[p - 1] += 1

for i in range(1000):
    if perimSolutions[i] > perimSolutions[answer]:
        answer = i

print(answer + 1)
