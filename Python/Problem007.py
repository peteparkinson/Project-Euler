"""
Project Euler, problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

answer = 104743  # correct
"""

from Tools import sieve_of_e

primes = sieve_of_e(1000000)

print(primes[10000])
