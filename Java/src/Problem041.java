import java.util.ArrayList;

/* Project Euler, problem 41
 * 
 * We shall say that an n-digit number is pandigital if it makes use of all the digits
 * 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.
 * 
 * What is the largest n-digit pandigital prime that exists?
 * 
 *  change mod and adjust sieve(x) length
 * there are no primes that are 8 pandigital
 * 9 pandigital is too large to check with this program, this needs fixed
 * the largest 7 pandigital number is the answer
 * 
 * answer = 7652413;  //correct
 */


public class Problem041 {
	
	
	static final int mod = 7;
	
	public static void main(String[] args){
		
		ArrayList<Integer> digits = Tools.sieve(7654321);
		
		for (int i = 0; i < digits.size(); i++) {
			String tmp = String.valueOf(digits.get(digits.size() - 1 - i));
			System.out.println("checking: " + tmp);
			if(isPandigital(tmp)){
				System.out.println(tmp);
				break;
			}
		}
	}

	public static boolean isPandigital(String digits) {
		
		for (int l = 1; l <= mod; l++) {
			if(digits.contains("0") || !digits.contains(String.valueOf(l)) || digits.length() != mod){
				return false;
			}
		}
		return true;
	}
}
