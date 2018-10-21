"""
Project Euler, problem 26

A unit fraction contains 1 in the numerator. The decimal representation
of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can
be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring
cycle in its decimal fraction part.

Solution
     1/7 = 0 (remainder 1.  multiply by 10 / 7, loop until repeating
     decimal)
           .
1 * 10/7 = 1 (remainder 3)
3 * 10/7 = 4 (remainder 2)
2 * 10/7 = 2 (remainder 6)
6 * 10/7 = 8 (remainder 4)
4 * 10/7 = 5 (remainder 5)
5 * 10/7 = 7 (remainder 1)
1 * 10/7 = 1 (remainder 3)
etc...


       1/401 = 0 (remainder 1)
       		   .
1   * 10/401 = 0 (remainder 10)
10  * 10/401 = 0 (remainder 100)
100 * 10/401 = 2 (remainder 198)
198 * 10/401 = 4 (remainder 376)
376 * 10/401 = 9 (remainder 151)
151 * 10/401 = 3 (remainder 307)
307 * 10/401 = 7 (remainder 263)

answer = 983;  //correct
"""


def pattern_size(num):
    count = 1
    index = 1
    rem = []

    for x in range(num + 1):
        rem.append(0)

    while index != 0 and rem[index] == 0:
        count += 1
        rem[index] = count
        index = index * 10 % num
    if index == 0:
        return 0
    return count - rem[index]


limit = 1000
longest = 0
answer = 0

for x in range(1, limit):
    if pattern_size(x) > longest:
        longest = pattern_size(x)
        answer = x

print(answer)
