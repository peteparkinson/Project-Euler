/* Project Euler, problem 30
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * 
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * As 1 = 1^4 is not a sum it is not included.
 * 
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * 
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * 
 * answer = 443839;  //correct
 */

public class Problem030 {
	public static void main(String[] args){
		
		int answer = 0;
		
		for (int i = 2; i < 200000; i++) {
			int sum = 0;
			String tmp = String.valueOf(i);
			for (int j = 0; j < tmp.length(); j++) {
				char digit = tmp.charAt(j);
				int num = Integer.parseInt(String.valueOf(digit));
				sum += (Math.pow(num, 5));
			}
			if(sum == i){
				answer += sum;
			}
		}
		System.out.println(answer);
	}
}
