=begin
The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 3025

Hence the difference between the sum of the squares of the 
first ten natural numbers and the square of the sum is,
    3025 - 385 = 2640

Find the difference between the sum of the squares of the 
first one hundred natural numbers and the square of the sum.
=end



def sumOfSq(num)
    sum = 0
    1.upto(num) { |i|
        sum += i ** 2
    }
    return sum
end

def sqOfSum(num)
    sq = 0
    1.upto(num) { |i|
        sq += i
    }
    return sq ** 2
end

puts sqOfSum(100) - sumOfSq(100)
