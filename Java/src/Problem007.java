/* Project Euler, problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 * 
 * 
 * this is definitely a brute force solution
 * 
 * answer = 104743;  //correct
 */
public class Problem007 {
	public static void main(String[] args){
		
		int brute = 0;
		
		for (int i = 2; i < 999999999; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0){
					isPrime = false;
				}
			}
			if(isPrime == true){
				brute++;
			}
			if(brute == 10001) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(brute + " brute");
	}
}
