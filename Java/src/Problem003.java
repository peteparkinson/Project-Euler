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

package projectEuler;

public class Problem003 {
	public static void main(String[] args) {
		
		long num = 600851475143L;
		int ans = 0;

		for(int i = 2; i < Math.ceil(Math.sqrt(num)); i++) {
			if(num % i == 0) {
				if(isPrime(i) && i > ans) {
					ans = i;
				} 
				if(isPrime(num / i) && (num / i) > ans) {
					ans = (int) (num / i);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static boolean isPrime(long num) {
		if(num == 1) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		
		for(int i = 2; i <= Math.ceil(Math.sqrt(num)); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
