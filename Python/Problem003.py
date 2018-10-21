"""
Project Euler, problem 3

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?

answer = 6857;  # correct
"""

num = 600851475143


def get_primes(limit):
    primes = []
    for y in range(2, limit):
        is_prime = 1
        for x in range(2, y - 1):
            if y % x == 0:
                is_prime = 0
        if is_prime:
            primes.append(y)

    return primes


primes = get_primes(10000)

for x in range(0, len(primes)):
    if num % primes[x] == 0:
        print(primes[x])

