import math

################################################
"""
check if specific number is prime
"""


def is_prime(num):
    if num == 1:
        return False
    if num > 2:
        for x in range(2, math.ceil(math.sqrt(num)) + 1):
            if(num % x == 0):
                return False
    return True


################################################
"""
find sum of all factors, 1 included, self excluded
"""


def sum_factors(num):
    sum = 1
    #for squares
    if math.sqrt(num) % 1 == 0 and num != 1:
        sum += math.sqrt(num)
        for x in range(2, int(math.sqrt(num)) - 1):
            if num % x == 0:
                sum += x + (num / x)

    # for non-squares
    else:
        for x in range(2, math.ceil(math.sqrt(num))):
            if num % x == 0:
                sum += x + (num / x)
    return sum


################################################
"""
checks if string is pandigital within passed range
"""


def is_pandigital(num, low_lim, up_lim):
    for x in range(low_lim, up_lim + 1):
        if(str(x) not in num
        or len(num) != up_lim - low_lim +1):
            return False
    return True


################################################
"""
factorial
"""


def factorial(num):
    if num == 0:
        return 1
    for x in range(2, num):
        num *= x

    return num


################################################
"""
Sieve of Eratosthenes
Works well up to at least 10M
"""


def sieve_of_e(num):
    primes = []
    prime = [True for i in range(num + 1)]
    p = 2
    while p * p <= num:

        # If prime[p] is not changed, then it is a prime
        if prime[p]:

            # Update all multiples of p
            for i in range(p * 2, num + 1, p):
                prime[i] = False
        p += 1

    # Print all prime numbers
    for p in range(2, num):
        if prime[p]:
            primes.append(p)

    return primes

################################################
# checks is string is a palindrome


def is_palindrome(num):
    if num == num[::-1]:
        return True
    return False
