import math

################################################
"""
check if specific number is prime
this needs fixed
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


################################################
"""
Sieve of Atkin
This code is contributed by Smitha
not working
"""


def sieve(limit):
    primes = []

    # 2 and 3 are known to be prime
    if limit > 2:
        primes.append(2)
    if limit > 3:
        primes.append(3)

    # Initialise the sieve array with False values
    sieve = [False] * limit
    for i in range(0, limit):
        sieve[i] = False

    x = 1
    while x * x < limit:
        y = 1
        while y * y < limit:

            # Main part of Sieve of Atkin
            n = (4 * x * x) + (y * y)
            if (n <= limit and (n % 12 == 1 or
                                n % 12 == 5)):
                sieve[n] ^= True

            n = (3 * x * x) + (y * y)
            if n <= limit and n % 12 == 7:
                sieve[n] ^= True

            n = (3 * x * x) - (y * y)
            if (x > y and n <= limit and
                    n % 12 == 11):
                sieve[n] ^= True
            y += 1
        x += 1

    # Mark all multiples of squares as non-prime
    r = 5
    while r * r < limit:
        if sieve[r]:
            for i in range(r * r, limit, r * r):
                sieve[i] = False

    # populate array
    for a in range(5, limit):
        if sieve[a]:
            primes.append(a)

    return primes
