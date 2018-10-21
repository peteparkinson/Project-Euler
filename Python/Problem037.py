"""
Project Euler, problem 37

The number 3797 has an interesting property. Being prime itself, it is possible
to continuously remove digits from left to right, and remain prime at each stage:
3797, 797, 97, and 7. Similarly we can work right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to
right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

answer = 748317;  //correct
"""

from Tools import sieve_of_e
from Tools import is_prime


def is_trunc(num):

    for x in range(1, len(str(num))):
        if not is_prime(int(num[x:])) \
                or not is_prime(int(num[:x])):
            return False
    return True


answer = 0
primes = sieve_of_e(1000000)

for x in range(4, len(primes)):
    if is_trunc(str(primes[x])):
        print(primes[x])
        answer += primes[x]

print("answer :", answer)
