=begin
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit 
numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 
3-digit numbers.
=end

def isPalindrome(num)
    return num.digits == num.digits.reverse()
end

ans = 0

999.downto(100) { |i| 
    999.downto(100) { |j| 
        if isPalindrome(i*j) && i*j > ans
            ans = i*j
        end
    }
}

puts ans
