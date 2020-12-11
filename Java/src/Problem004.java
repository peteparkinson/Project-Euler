/* Project Euler, problem 4 
 * 
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * answer = 906609;  //correct
 */

public class Problem004 {
	public static void main(String[] args) {
		int ans = 0;
		for(int i = 999; i > 0; i--) {
			for(int j = 999; j > 0; j--) {
				if(isPal(i * j) && i * j > ans) {
					ans = i * j;
				}
			}
		}
		System.out.println(ans);
	}
	
	public static boolean isPal(int num) {
		
		String str = String.valueOf(num);
		
		for(int i = 0; i <= str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
