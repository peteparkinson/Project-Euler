"""
Project Euler, problem 43

The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each
of the digits 0 to 9 in some order, but it also has a rather interesting sub-string
divisibility property.

Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the
following:

d2d3d4=406 is divisible by 2
d3d4d5=063 is divisible by 3
d4d5d6=635 is divisible by 5
d5d6d7=357 is divisible by 7
d6d7d8=572 is divisible by 11
d7d8d9=728 is divisible by 13
d8d9d10=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.

answer = 16695334890;  //correct
"""


def sub_div(check):
    primes = [2, 3, 5, 7, 11, 13, 17]

    for i in range(1, 8):
        tmp = ""
        for j in range(3):
            tmp += str(check[i + j])
        if int(tmp) % primes[i - 1] != 0:
            return False

    return True


digits = []
answer = 0

for a in range(10):
    for b in range(9):
        for c in range(8):
            for d in range(7):
                for e in range(6):
                    for f in range(5):
                        for g in range(4):
                            for h in range(3):
                                for i in range(2):

                                    check = ""
                                    for j in range(10):
                                        digits.append(j)
                                    check += str(digits[a])
                                    digits.pop(a)
                                    check += str(digits[b])
                                    digits.pop(b)
                                    check += str(digits[c])
                                    digits.pop(c)
                                    check += str(digits[d])
                                    digits.pop(d)
                                    check += str(digits[e])
                                    digits.pop(e)
                                    check += str(digits[f])
                                    digits.pop(f)
                                    check += str(digits[g])
                                    digits.pop(g)
                                    check += str(digits[h])
                                    digits.pop(h)
                                    check += str(digits[i])
                                    digits.pop(i)
                                    check += str(digits[0])
                                    digits.pop(0)

                                    if sub_div(check):
                                        print(check)
                                        answer += int(check)
print(answer)
