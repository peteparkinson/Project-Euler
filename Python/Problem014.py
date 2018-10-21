"""
Project Euler, problem 14
The following iterative sequence is defined for the set of positive integers:

if n is even then n/2
if n is odd then 3n + 1

Using the rule above and starting with 13, we generate the following sequence:

13 to 40 to 20 to 10 to 5 to 16 to 8 to 4 to 2 to 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting
numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

answer = 837799  //correct
"""

answer = 0
highest = 0
for x in range(2, 1000000):
    chain = 0
    n = x
    if x % 1000 == 0:
        print(x)
    while n != 1:
        chain += 1
        if n % 2 == 0:
            n /= 2
        else:
            n = n * 3 + 1
    if chain > highest:
        highest = chain
        answer = x

print("answer: ", answer)
