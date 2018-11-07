/* Project Euler, problem 50
 * 
 * The prime 41, can be written as the sum of six consecutive primes:
 * 
 * 41 = 2 + 3 + 5 + 7 + 11 + 13
 * This is the longest sum of consecutive primes that adds to a prime
 * below one-hundred.
 * 
 * The longest sum of consecutive primes below one-thousand that adds
 * to a prime, contains 21 terms, and is equal to 953.
 * 
 * Which prime, below one-million, can be written as the sum of the
 * most consecutive primes?
 * 
 * answer = 997651;  //correct
 */

import java.util.ArrayList;

public class Problem050 {
	
	static ArrayList<Integer> primes = Tools.sieve(1000000);
	
	public static void main(String[] args){
		
		int ref = 0;
		int startAt = 0;
		int answer = 0;
		
		for (int i = 0; i < 10; i++) {
			int tmp = 0;
			System.out.println("\nchecking: " + primes.get(i));
			for (int j = 0; j < 10000; j++) {
				if(tmp + primes.get(i + j) < 1000000){
					tmp += primes.get(i + j);
					if(Tools.isPrime(tmp)){
						System.out.println(tmp + " prime. terms:  " + (j + 1));
						if(j > ref){
							ref = j + 1;
							answer = tmp;
							startAt = primes.get(i);
						}
					}else{
	
						System.out.println(tmp + " composite. terms: " + (j + 1));
					}
				}else{
					break;
				}
			}
		}
		System.out.println("start at: " + startAt + " : " + answer);
		System.out.println("consecutive primes " + ref);
	}
}
