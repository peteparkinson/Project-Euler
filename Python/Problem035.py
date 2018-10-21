"""
Project Euler, problem 35

The number, 197, is called a circular prime because all rotations of the digits:
197, 971, and 719, are themselves prime.

There are thirteen such primes below 100:
2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?

answer = 55
"""

from Tools import is_prime
from Tools import sieve_of_e


def rotate(num):
    chars = list(num)
    tmp = ""
    for x in range(1, len(chars)):
        tmp += chars[x]
    tmp += chars[0]
    return tmp


count = 0
primes = sieve_of_e(1000000)

for i in primes:
    check = i
    circular = True
    for x in range(len(str(check))):
        if not is_prime(int(check)):
            circular = False
            break
        else:
            check = rotate(str(check))
    if circular:
        count += 1

print(count)

