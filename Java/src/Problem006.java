/* Project Euler, prablem 6
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first
 * ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first
 * one hundred natural numbers and the square of the sum.
 * 
 * not sure if this is a brute force solution or not, is fast
 * 
 * answer = 25164150;  //correct
 */

public class Problem006 {
	public static void main(String[] args){

		//double time = System.currentTimeMillis();
		
		int square = 0;
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			square += i * i;
			sum += i;
		}
		System.out.println((sum * sum) - square);
		//System.out.println(System.currentTimeMillis() - time);
	}
}
