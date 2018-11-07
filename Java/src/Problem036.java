/* Project Euler, problem 36
 * 
 * The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.
 * 
 * Find the sum of all numbers, less than one million, which are palindromic in
 * base 10 and base 2.
 * 
 * (Please note that the palindromic number, in either base, may not include
 * leading zeros.)
 * 
 * answer = 872187;  //correct
 */


public class Problem036 {
	public static void main(String[] args){
		
		int answer = 0;
		
		for (int i = 1; i < 1000000; i++) {
			String binary = Tools.toBinary(i);
			if(Tools.isPalindrome(i) 
			&& Tools.isStrPalindrome(binary)){
				answer += i;
			}
		}
		System.out.println(answer);
	}
}
