"""
Project Euler, problem 20

n! means n × (n - 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

answer = 648;  //correct
"""

from Tools import factorial

number = str(factorial(100))
answer = 0

for x in range(len(number)):
    answer += int(number[x])

print(answer)
