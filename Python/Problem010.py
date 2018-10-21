"""
Project Euler, problem 10

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

answer = 142913828922  # correct
"""

from Tools import sieve_of_e

answer = 0
primes = sieve_of_e(2000000)

for x in range(0, len(primes)):
    answer += primes[x]

print(answer)
