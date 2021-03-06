"""
Project Euler, problem 2

Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms."

answer = 4613732;  # correct
"""

fib = [1, 1]
answer = 0
i = 0

while fib[0] < 4000000 and fib[1] < 4000000:
    if fib[i] % 2 == 0 :
        answer += fib[i]

    fib[1 - i] += fib[i]
    i ^= 1

print(answer)
