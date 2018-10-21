"""
Project Euler, problem 36

The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in
base 10 and base 2.

(Please note that the palindromic number, in either base, may not include
leading zeros.)

answer = 872187;  //correct
"""

from Tools import is_palindrome

answer = 0

for x in range(1, 1000000):
    if is_palindrome(str(x))\
            and is_palindrome(str(bin(x)[2:])):
        answer += x

print(answer)
