"""
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

answer = 171;  //correct
"""

days = 0
answer = 0
months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

for x in range(1901, 2000):
    if x % 4 == 0:
        months[1] = 29
    else:
        months[1] = 28
    for y in months:
        days += y
        if (days + 1) % 7 == 0:
            answer += 1

print(answer)
