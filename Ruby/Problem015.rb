=begin
Starting in the top left corner of a 2×2 grid, and only being able 
to move to the right and down, there are exactly 6 routes to the 
bottom right corner.

How many such routes are there through a 20×20 grid?
=end

def factorial(num)
    total = 1
    2.upto(num){|i| 
        total *= i
    }
    return total
end

num = 20 
puts factorial(num * 2) / factorial(num) / factorial(num)
