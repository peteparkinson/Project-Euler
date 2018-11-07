/* Project Euler, problem 1.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * answer = 233168;  //correct
 */

public class Problem001 {
	public static void main(String[] args){
		
		int answer = 0;
		
		for (int i = 1; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0){
				answer += i;
			}
		}
		System.out.println(answer);
	}
}
