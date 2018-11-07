/* Project Euler, problem 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * used sieve of Atkin from "Tools" class
 * 
 * answer = 142913828922;  //correct
 */

import java.util.ArrayList;

public class Problem010 {
	public static void main(String[] args) {

		long answer = 0L;
		ArrayList<Integer> primes = Tools.sieve(2000000);
		for (int i = 0; i < primes.size(); i++) {
			answer += primes.get(i);
		}
		System.out.println(answer);
	}
}
