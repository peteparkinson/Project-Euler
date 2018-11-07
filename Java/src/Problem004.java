/* Project Euler, problem 4 
 * 
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * answer = 906609;  //correct
 */

public class Problem004 {
	public static void main(String[] args){

		int total = 0;
		int num1 = 0;
		int num2 = 0;
		
		double time = System.currentTimeMillis();
		
		int stopAt = 0;
		
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				if(Tools.isPalindrome(i * j)){
					if(i < j) {
						stopAt = i;
					}else {
						stopAt = j;
					}
					i = 99;
					j = 99;
				}
			}
		}
		for (int i = 999; i >= stopAt; i--) {
			for (int j = 999; j >= stopAt; j--) {
				if(Tools.isPalindrome(i * j)){
					if(i * j > total) {
						total = i * j;
						num1 = i;
						num2 = j;
					}
				}
			}
		}
		System.out.print(num1 + " * ");
		System.out.print(num2 + " = ");
		System.out.println(total);
		System.out.println((System.currentTimeMillis() - time) + " ms");
	}
}
