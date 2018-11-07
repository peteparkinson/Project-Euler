import java.util.ArrayList;
import java.util.Scanner;

/*Project Euler, problem 5
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * answer = 232792560;  //correct
 */

public class Problem005 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num;
		long answer = 1L;
		
		System.out.println("Calculates lowest common multiple of natural numbers from 1 to 'n'.");
		System.out.print("Please specify 'n': ");
		
		num = sc.nextInt();
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		//populates list of primes less than or equal to n
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0){
					isPrime = false;
				}
			}
			if(isPrime == true){
				primes.add(i);
			}
		}
		
		for (int i = 0; i < primes.size(); i++) {
			int temp = primes.get(i);
			while((temp * primes.get(i)) <= num){
				temp *= primes.get(i);
			}
			answer *= temp;
		}
		System.out.println(answer);
	}
}
