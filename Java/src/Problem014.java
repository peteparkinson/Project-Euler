/*Project Euler, problem 14
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * if n is even then n/2
 * if n is odd then 3n + 1
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13 to 40 to 20 to 10 to 5 to 16 to 8 to 4 to 2 to 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting
 * numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * answer = 837799  //correct
 * 
 */

public class Problem014 {
	public static void main(String[] args){
		
		long answer = 0L;
		int terms = 0;
		
		
		for (int i = 1; i < 1000000; i++) {
			System.out.print(i + " ");
			int tmp = getTerms(i);
			if(tmp > terms){
				terms = tmp;
				answer = i;
			}
		}
		
		System.out.println(answer);
		
	}

	private static int getTerms(long i) {

		int terms = 1;
		
		while(i != 1){
			if(i % 2 == 0){
				i /= 2;
				terms++;
			}else{
				i = i * 3 + 1;
				terms++;
			}
		}
		System.out.println("terms: " + terms);
		return terms;
	}
}
