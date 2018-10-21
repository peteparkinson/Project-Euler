"""
Project Euler, problem 5

2520 is the smallest number that can be divided by each of
the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible
by all of the numbers from 1 to 20?

answer = 232792560  # correct
"""

from Tools import sieve

primes = sieve(20)
answer = 1

for x in range(0, len(primes)):
    tmp = primes[x]
    while tmp * primes[x] <= 20:
        tmp *= primes[x]
    answer *= tmp
print(answer)
