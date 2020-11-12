=begin
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
=end

def isPrime(num)
    if num == 1 
        return false
    end
    if num == 2 
        return true
    end
    for i in 2..Math.sqrt(num).ceil() do
        if num % i == 0 
            return false
        end
    end
    return true
end

for i in 2..Math.sqrt(600851475143).ceil() do
    if isPrime(i) && 600851475143 % i == 0
        puts i
    end
end
