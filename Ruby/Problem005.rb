=begin
2520 is the smallest number that can be divided by each 
of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly 
divisible by all of the numbers from 1 to 20?

explanation:
    1. i = list of all primes less than n
    2. x = highest power of i while i^x < n
    3. answer *= i^x
=end

def isPrime(num)
    if num == 2
        return true
    end
    2.upto(Math.sqrt(num).ceil) { |i|
        if num % i == 0
            return false
        end
    }
    return true
end

n = 20
ans = 1;

2.upto(n) { |i|
    if isPrime(i)
        x = 1
        while i ** (x + 1) < n
            x += 1
        end 
        ans *= i ** x
    end
}

puts ans
