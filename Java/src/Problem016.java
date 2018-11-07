/*Project Euler, problem 16
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * Answer: 1366;  //correct
 */

import java.math.BigInteger;

public class Problem016 {
	public static void main(String[] args){
		
		BigInteger num = new BigInteger("2");
		String digits;

		int total = 0;
		
		for (int i = 1; i < 1000; i++) {
			num = num.multiply(BigInteger.valueOf(2));
		}
		
		digits = num.toString();
		
		for (int i = 0; i < digits.length(); i++) {
			total += Integer.parseInt(String.valueOf(digits.charAt(i)));
		}
		System.out.println(total);
	}
}
