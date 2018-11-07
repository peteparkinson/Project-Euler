import java.util.ArrayList;

/* Project Euler, problem 32
 * 
 * We shall say that an n-digit number is pandigital if it makes use of all the
 * digits 1 to n exactly once; for example, the 5-digit number, 15234, 
 * is 1 through 5 pandigital.
 * 
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing
 * multiplicand, multiplier, and product is 1 through 9 pandigital.
 * 
 * Find the sum of all products whose multiplicand/multiplier/product identity
 * can be written as a 1 through 9 pandigital.
 * 
 * HINT: Some products can be obtained in more than one way so be sure to only
 * include it once in your sum.
 * 
 * answer = 45228;  //correct
 */


public class Problem032 {
	public static void main(String[] args){
		
		int answer = 0;
		ArrayList<Integer> pans = new ArrayList<Integer>();
		
		for (int i = 1; i <= 98; i++) {
			for (int j = 123; j <= 9876; j++) {
				String tmp = String.valueOf(i) +
							 String.valueOf(j) +
							 String.valueOf(i * j);
				if(tmp.length() == 9 
				&& isPan(tmp)
				&& !pans.contains(i * j)){
					pans.add(i * j); 
				}
			}
		}
		for (int i = 0; i < pans.size(); i++) {
			answer += pans.get(i);
		}
		System.out.println(answer);
	}

	private static boolean isPan(String digits) {
		
		for (int l = 1; l <= 9; l++) {
			if(!digits.contains(String.valueOf(l))){
				return false;
			}
		}
		return true;
	}
}
