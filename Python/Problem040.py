"""
Project Euler, problem 40

An irrational decimal fraction is created by concatenating the positive
integers:	0.12345678910'1'112131415161718192021...

It can be seen that the 12th digit of the fractional part is 1.

If dn represents the nth digit of the fractional part, find the value of
the following expression.

d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000

answer = 210  # correct
"""


num = 0
answer = 1

for i in range(1000001):
    power = int(len(str(i)))

    for j in range(len(str(i))):
        if num == 10 ** power - j:
            answer *= int(str(i)[j])
    num += power
print("answer: ", answer)
