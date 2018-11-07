/*	Project Euler, problem 34
 * 
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * 
 * Find the sum of all numbers which are equal to the sum of the factorial of
 * their digits.
 * 
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 * 
 * answer = 40730;  //correct
 */


public class Problem034 {
	public static void main(String[] args){
		
		int answer = 0;
		
		for (int i = 3; i <= 99999; i++) {
			if(getDigFact(i)){
				answer += i;
			}
		}
		System.out.println(answer);
	}

	//returns true if sum of factorial of digits of passed num are equal to num
	private static boolean getDigFact(int num) {
		
		boolean isEqual = false;
		int length = String.valueOf(num).length();
		int sum = 0;
		
		for (int i = 0; i < length; i ++) {
			int tmp = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
			sum += factorial(tmp);
		}
		if(sum == num){
			isEqual = true;
		}
		return isEqual;
	}
	
	private static int factorial(int num) {
		int answer = 1;
		for (int i = 1; i <= num; i++) {
			answer *= i;
		}
		return answer;
	}
}
