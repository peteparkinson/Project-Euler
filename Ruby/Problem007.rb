=begin
By listing the first six prime numbers: 
2, 3, 5, 7, 11, and 13, 
we can see that the 6th prime is 13.

What is the 10 001st prime number?
=end


def isPrime(num)
    2.upto(Math.sqrt(num).ceil){ |i|
        if num % i == 0
            return false
        end
    }
    return true
end

primes = 1

3.upto(999999){|i|
    if isPrime(i)
        primes += 1
    end
    if primes == 10001
        puts i
        return
    end
}
