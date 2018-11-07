/* Project Euler, problem 46
 * 
 * It was proposed by Christian Goldbach that every odd composite number can
 * be written as the sum of a prime and twice a square.
 * 
 * 9 = 7 + 2×1^2
 * 15 = 7 + 2×2^2
 * 21 = 3 + 2×3^2
 * 25 = 7 + 2×3^2
 * 27 = 19 + 2×2^2
 * 33 = 31 + 2×1^2
 * 
 * It turns out that the conjecture was false.
 * 
 * What is the smallest odd composite that cannot be written as the sum of a
 * prime and twice a square?
 * 
 * 
 */

import java.util.ArrayList;

public class Problem046 {
	public static void main(String[] args){

		int limit = 10000;
		boolean compliant;
		
		ArrayList<Integer> primes = Tools.sieve(limit);
		ArrayList<Integer> terms = new ArrayList<Integer>();
		
		for (int i = 1; i <= Math.ceil(Math.sqrt(limit)); i++) {
			terms.add((i * i));
		}
		
		for (int i = 3; i < limit; i += 2) {
			compliant= false;
			if(!Tools.isPrime(i)){
				System.out.print("checking: " + i + " ");
				
				for (int j = 0; j < primes.size(); j++) {
					for (int k = 0; k < terms.size(); k++) {
						if(primes.get(j) + (terms.get(k) * 2)== i){
							compliant = true;
							System.out.println(primes.get(j) + " + " + " 2 * " + terms.get(k));
							break;
						}
					}
					if(compliant == true){
						break;
					}
					if(j == primes.size() - 1){
						System.out.println("\nno solutions for " + i);
						return;
					}
				}
			}
		}
	}
}
