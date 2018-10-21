"""
Project Euler, problem 32

We shall say that an n-digit number is pandigital if it makes use of all the
digits 1 to n exactly once; for example, the 5-digit number, 15234,
is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing
multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity
can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only
include it once in your sum.

answer = 45228;  //correct
"""

from Tools import is_pandigital

pans = []

for x in range(99):
    for y in range(123, 9877):
        tmp = str(x) + str(y) + str(x * y)
        if(len(tmp) == 9
                and is_pandigital(tmp, 1, 9)
                and x * y not in pans):
            pans.append(x * y)

print(sum(pans))
