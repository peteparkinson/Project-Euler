/* Project Euler, problem 25
 * The Fibonacci sequence is defined by the recurrence relation:
 * 
 * Fn = Fn-1 + Fn-2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 * 
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 * 
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * answer = 4782;  //correct
 */

import java.math.BigInteger;

public class Problem025 {
	public static void main(String[] args) {
		
		BigInteger[] fib = new BigInteger[2];
		BigInteger limit = new BigInteger("10").pow(999);
		
		fib[0] = fib[1]  = new BigInteger("1");	
		int answer = 2;
		int i = 0;
		
		/*the 1000th digit will appear when i == 1
		 * but to make the value modifiable, a condition
		 * for both i == 0 and i == 1 was added
		 */
		while(fib[0].compareTo(limit) <= 0
		   && fib[1].compareTo(limit) <= 0) {

			fib[i] = fib[0].add(fib[1]);
			if(i == 0) {
				i++;
			}else {
				i--;
			}
			answer++;
		}
		System.out.println(answer);
	}
}
