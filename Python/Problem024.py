"""
Project Euler, problem 24

A permutation is an ordered arrangement of objects. For example,
3124 is one possible permutation of the digits 1, 2, 3 and 4. If
all of the permutations are listed numerically or alphabetically,
we call it lexicographic order. The lexicographic permutations of
0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits
 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

answer = [2, 7, 8, 3, 9, 1, 5, 4, 6, 0];  //correct
"""

from Tools import factorial

choice = []
answer = []

limit = 1000000

for x in range(10):
    choice.append(x)

for x in range(9, -1, -1):
    ref = 0
    while limit - factorial(x) > 0:
        print(limit)
        ref += 1
        limit -= factorial(x)
    answer.append(choice[ref])
    choice.pop(ref)

print(answer)
