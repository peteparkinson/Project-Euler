"""
Project Euler, problem 34

145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of
their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.

answer = 40730;  //correct
"""

from Tools import factorial


def check_sum(num):
    sum = 0
    for i in range(len(str(num))):
        sum += factorial(int(str(num)[i]))
    return sum


answer = 0

for x in range(3, 99999):
    if check_sum(x) == x:
        print(x)
        answer += x
print(answer)
