=begin
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

=end


def isPrime(num)
    if num == 1
        return false
    end
    if num == 2
        return true
    end
    2.upto(Math.sqrt(num).ceil){|i|
        if num % i == 0
            return false
        end
    }
    return true
end

sumOfPrimes = 0

2.upto(1999999){|i|
    if isPrime(i)
        sumOfPrimes += i
    end
}

puts sumOfPrimes
