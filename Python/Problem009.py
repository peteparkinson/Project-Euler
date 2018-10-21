"""
Project Euler, problem 9
A Pythagorean triplet is a set of three natural numbers
a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which
a + b + c = 1000.
Find the product abc.

answer = 31875000  # correct
"""

for a in range(1, 333):
    print("checking: ", a)
    for b in range(1, 500):
        for c in range(1, 666):
            if a + b + c == 1000 and a*a + b*b == c*c:
                print(a, " ", b, " ", c)
                print(a * b * c)
                exit()
