"""
Project Euler, problem 41

We shall say that an n-digit number is pandigital if it makes use of all the digits
1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?

change mod and adjust sieve(x) length
there are no primes that are 8 pandigital
9 pandigital is too large to check with this program, this needs fixed
the largest 7 pan-digital number is the answer

answer = 7652413;  //correct
"""

from Tools import sieve_of_e
from Tools import is_pandigital

digits = sieve_of_e(7654321)

for x in range(len(digits)):
    tmp = str(digits[len(digits) - 1 - x])
    if is_pandigital(tmp, 1, 7):
        print(tmp)
        break
