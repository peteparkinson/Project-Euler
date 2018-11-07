/* Project Euler, problem 3
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * 
 * The program is currently configured to show all factors, so
 * more efficiencies can be made, but I wanted to include even factors
 * 
 * answer = 6857;  //correct
 */

import java.util.ArrayList;

public class Problem003 {
	public static void main(String[] args){
		
		long val = 600851475143L;
		long answer = 0;
		
		ArrayList<Long> factors = new ArrayList<Long>();
		ArrayList<Long> primes = new ArrayList<Long>();
		
		//get factors below sqrt
		for (int i = 2; i <= Math.floor(Math.sqrt(val)); i++) {
			if(val % i == 0){
				factors.add((long) i);
			}
		}
		//add corresponding factors (above sqrt) to factor list
		int a = factors.size();
		for (int i = a; i > 0; i--) {
			if(factors.get(i-1) != Math.ceil(Math.sqrt(val)) ){
				factors.add((long) (val / factors.get(i-1)));
			}
		}
		//check factors for primeness
		for (int i = 0; i < factors.size(); i++) {
			if(checkPrime(factors.get(i))){
				primes.add(factors.get(i));
			}
		}
		//find largest
		for(long i : primes){
			if(i > answer){
				answer = i;
			}
		}
		System.out.println("Factors: " + factors);
		System.out.println("Prime factors: " + primes);
		if(answer == 0){
			System.out.print(val + " is prime.");
			if(val == 1){ System.out.println("..kind of...");}
		}else{
			System.out.println("Largest prime factor: " + answer);
		}
	}

	private static boolean checkPrime(Long num) {
		boolean isPrime = true;		
		for (int i = 2; i <= Math.ceil(Math.sqrt(num)); i++) {
			if(num % i == 0  && num != 2){
				isPrime = false;
			}
		}
		return isPrime;
	}
}
