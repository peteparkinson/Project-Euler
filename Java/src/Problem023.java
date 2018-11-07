/* Project Euler, problem 23
 * 
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that
 * 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called
 * abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written
 * as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers
 * greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot
 * be reduced any further by analysis even though it is known that the greatest number that cannot be
 * expressed as the sum of two abundant numbers is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * 
 * answer = 4179871 //correct
 * 
 */

import java.util.ArrayList;

public class Problem023 {
	public static void main(String[] args){
		
		int limit = 28123;
		int answer = 0;
		ArrayList<Integer> abundant  = new ArrayList<Integer>();
		boolean[] sumOfTwoAbundants = new boolean[limit];
		
		//generate list of abundant numbers <= 28123
		for (int i = 1; i <= limit; i++) {
			if(isAbundant(i)){
				abundant.add(i);
			}
		}
		
		//populates boolean array with true in addresses == sum of 2 abundant numbers
		for (int i = 0; i < abundant.size(); i++) {
			for (int j = 0; j < abundant.size(); j++) {
				if((abundant.get(i) + abundant.get(j)) < limit){
					sumOfTwoAbundants[abundant.get(i) + abundant.get(j)] = true;
				}
			}
		}
		
		//sum addresses with false
		for (int i = 0; i < sumOfTwoAbundants.length; i++) {
			if(!sumOfTwoAbundants[i]){
				answer += i;
			}
		}
		System.out.println(answer);
	}

	private static boolean isAbundant(int a) {
		
		int sum = 0;
		boolean abundant = false;
		
		for (int i = 1; i < a; i++) {
			if(a % i == 0){
				sum += i; 
			}
		}
		if(sum > a){
			abundant = true;
		}
		return abundant;
	}
}
