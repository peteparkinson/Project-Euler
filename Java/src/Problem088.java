/*Project Euler, problem 88
 * 
 * A natural number, N, that can be written as the sum and product of a given set of at
 * least two natural numbers, {a1, a2, ... , ak} is called a product-sum number:
 * N = a1 + a2 + ... + ak = a1 × a2 × ... × ak.
 * 
 * For example, 6 = 1 + 2 + 3 = 1 × 2 × 3.
 * 
 * For a given set of size, k, we shall call the smallest N with this property a minimal
 * product-sum number. The minimal product-sum numbers for sets of size,
 * k = 2, 3, 4, 5, and 6 are as follows.
 * 
 * k=2: 4 = 2 × 2 = 2 + 2
 * k=3: 6 = 1 × 2 × 3 = 1 + 2 + 3
 * k=4: 8 = 1 × 1 × 2 × 4 = 1 + 1 + 2 + 4
 * k=5: 8 = 1 × 1 × 2 × 2 × 2 = 1 + 1 + 2 + 2 + 2
 * k=6: 12 = 1 × 1 × 1 × 1 × 2 × 6 = 1 + 1 + 1 + 1 + 2 + 6
 * 
 * Hence for 2<=k<=6, the sum of all the minimal product-sum numbers is 4+6+8+12 = 30;
 * note that 8 is only counted once in the sum.
 * 
 * In fact, as the complete set of minimal product-sum numbers for 2<=k<=12 is
 * {4, 6, 8, 12, 15, 16}, the sum is 61.
 * 
 * What is the sum of all the minimal product-sum numbers for 2<=k<=12000?
 * 
 * WIP, don't judge
 */

import java.util.ArrayList;


public class Problem088 {
	public static void main(String[] args){
		
		ArrayList<Integer> PSNumbers = new ArrayList<Integer>();
		ArrayList<Integer> factors;
		
		for (int i = 2; i <= 12000; i++) {
			for (int j = PSNumbers.get(PSNumbers.size()); j < 12000; j++) {
				factors = getFactors(i);
			}
		}
		
		int num = 12;
		
		if(checkPS(num)){
			
		}
		
	}

	private static ArrayList<Integer> getFactors(int num) {

		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		//for squares
		if(num % Math.sqrt(num) == 0){
			for (int i = 1; i <= Math.sqrt(num); i++) {
				if(num % i == 0){
					factors.add(i);
				}
			}
			
		}else{
			//for non-squares
			for (int i = 1; i <= Math.floor(Math.sqrt(num)); i++) {
				if(num % i == 0){
					factors.add(i);
				}				
			}
		}
		
		return factors;
	}

	private static boolean checkPS(int num) {

		
		
		return false;
	}
		
}
