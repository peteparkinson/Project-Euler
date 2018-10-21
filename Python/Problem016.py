"""
Project Euler, problem 16

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

answer: 1366;  #correct
"""

answer = 0
number = str(2**1000)
for x in range(len(number)):
    answer += int(number[x])

print(answer)
