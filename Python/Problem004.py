"""
Project Euler, problem 4

A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.

answer = 906609  #correct
"""

from Tools import is_palindrome

answer = 0

for x in range(1000, 1, -1):
    for y in range(1000, 1, -1):
        if is_palindrome(str(x * y)) and x * y > answer:
            answer = x * y

print(answer)


