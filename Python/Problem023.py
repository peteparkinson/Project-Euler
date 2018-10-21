"""
Project Euler, problem 23

A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that
28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called
abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written
as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers
greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot
be reduced any further by analysis even though it is known that the greatest number that cannot be
expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

answer = 4179871 //correct
"""

import math


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


def is_abundant(num):
    if sum_factors(num) > num:
        return True
    else:
        return False


answer = 0
abundants = []
sumMe = []
for x in range(28123):
    sumMe.append(False)
print("bool array populated")

for x in range(1, 28123):
    if is_abundant(x):
        abundants.append(x)
print("abundant numbers array populated")

for x in abundants:
    for y in abundants:
        if x + y < 28123:
            sumMe[x + y] = True
print("abundants marked True")

for x in range(28123):
    if not sumMe[x]:
        answer += x
print(answer)
