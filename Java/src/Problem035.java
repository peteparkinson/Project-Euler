/* Project Euler, problem 35
 * 
 * The number, 197, is called a circular prime because all rotations
 * of the digits: 197, 971, and 719, are themselves prime.
 * 
 * There are thirteen such primes below 100:
 * 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 * 
 * How many circular primes are there below one million?
 * 
 * answer = 55;  //correct
 */

import java.util.ArrayList;

public class Problem035 {
	
	static int[] numbers;
	static ArrayList<Integer> primes = Tools.sieve(1000000);
	
	public static void main(String[] args) {
		
		int answer = 0;
		
		for (int i = 0; i < primes.size(); i++) {
			if(isCircular(primes.get(i))) {
				answer++;
			}
		}
		System.out.println(answer);
	}

	private static boolean isCircular(int num) {
		
		boolean circular = true;
		int[] number = Tools.rotate(num);
		
		for (int i = 0; i < number.length; i++) {
			if(!Tools.isPrime(number[i])) {
				circular = false;
			}
		}
		return circular;
	}
}
