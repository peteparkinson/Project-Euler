import java.util.ArrayList;

/* Project Euler, problem 37
 * 
 * The number 3797 has an interesting property. Being prime itself, it is possible
 * to continuously remove digits from left to right, and remain prime at each stage:
 * 3797, 797, 97, and 7. Similarly we can work right to left: 3797, 379, 37, and 3.
 * 
 * Find the sum of the only eleven primes that are both truncatable from left to
 * right and right to left.
 * 
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 * 
 * answer = 748317;  //correct
 */


public class Problem037 {
	public static void main(String[] args){
		
		int answer = 0;
		ArrayList<Integer> primes = Tools.sieve(1000000);
		//start at 4 to ignore 2, 3, 5, 7 (given)
		for (int i = 4; i < primes.size(); i++) {
			String checkMe = String.valueOf(primes.get(i));
			if(truncIsPrime(checkMe)){
				answer += primes.get(i);
				System.out.println("adding: " + primes.get(i));
				
			}
		}
		System.out.println("answer: " + answer);
	}

	private static boolean truncIsPrime(String number) {
		
		//truncate left char
		StringBuilder tmp = new StringBuilder(number);
		
		for (int i = 0; i < number.length() - 1; i++) {
			tmp.deleteCharAt(0);
			if(!Tools.isPrime(Integer.parseInt(String.valueOf(tmp)))){
				return false;
			}
		}
		
		//truncate right char
		tmp = new StringBuilder(number);
		
		for (int i = 0; i < number.length() - 1; i++) {
			tmp.deleteCharAt(tmp.length() - 1);
			if(!Tools.isPrime(Integer.parseInt(String.valueOf(tmp)))){
				return false;
			}
		}
		return true;
	}
}
