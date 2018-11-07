import java.util.ArrayList;

/*Project Euler, problem 24
 * 
 * A permutation is an ordered arrangement of objects. For example,
 * 3124 is one possible permutation of the digits 1, 2, 3 and 4. If
 * all of the permutations are listed numerically or alphabetically,
 * we call it lexicographic order. The lexicographic permutations of
 * 0, 1 and 2 are:
 * 
 * 012   021   102   120   201   210
 * 
 * What is the millionth lexicographic permutation of the digits
 * 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 * 
 * answer = [2, 7, 8, 3, 9, 1, 5, 4, 6, 0];  //correct
 * 
 */


public class Problem024 {
	public static void main(String[] args){
		
		ArrayList<Integer> choice = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int limit = 1000000 ;
		
		for (int i = 0; i < 10; i++) {
			choice.add(i);
		}

		for (int i = 9; i >= 0; i--) {
			int ref = 0;
			while(limit - factorial(i) > 0){
				ref++;
				limit -= factorial(i);
			}
			answer.add(choice.get(ref));
			choice.remove(ref);
		}
		System.out.println(answer);
	}
	
	private static int factorial(int i) {
		int ref = 1;
		for (int j = 2; j <= i; j++) {
			ref *= j;
		}
		return ref;
	}
	
	
	
}
