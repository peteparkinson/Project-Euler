import java.util.ArrayList;

/* Problem 74 - Digit factorial chains
 * 
 * The number 145 is well known for the property that the 
 * sum of the factorial of its digits is equal to 145:
 * 
 * 1! + 4! + 5! = 1 + 24 + 120 = 145
 * 
 * Perhaps less well known is 169, in that it produces the 
 * longest chain of numbers that link back to 169; it turns 
 * out that there are only three such loops that exist:
 * 
 * 169 -> 363601 - 1454 -> 169
 * 871 -> 45361 -> 871
 * 872 -> 45362 -> 872
 * 
 * It is not difficult to prove that EVERY starting number will 
 * eventually get stuck in a loop. For example,
 * 
 * 69 -> 363600 -> 1454 -> 169 -> 363601 (- 1454)
 * 78 -> 45360 -> 871 -> 45361 (- 871)
 * 540 -> 145 (- 145)
 * 
 * Starting with 69 produces a chain of five non-repeating terms, 
 * but the longest non-repeating chain with a starting number 
 * below one million is sixty terms.
 * 
 * How many chains, with a starting number below one million, 
 * contain exactly sixty non-repeating terms?
 * 
 * ans = 402;  //correct
 * 
 */


public class Problem074 {
	public static void main(String[] args){
		
		ArrayList<Integer> loop;
		int ans = 0;

		for(int i = 1; i < 1000000; i++){
			loop = new ArrayList<Integer>();
			loop.add(i);
			int count = 1;
			int ref = digitFactSum(i);
			while(!loop.contains(ref)){
				loop.add(ref);
				ref = digitFactSum(ref);
				count++;
			}
			if(count == 60){
				ans++;
			}
			
		}
		System.out.println(ans);

	}
	
	public static int digitFactSum(int num){
		int ans = 0;
		String str = String.valueOf(num);
		for(int i = 0; i < str.length(); i++){
			ans += factorial(Integer.parseInt(String.valueOf(str.charAt(i))));
		}
		return ans;
	}
	
	public static int factorial(int num){
		int ans = 1;
		for(int i = 2; i <= num; i++){
			ans *= i;
		}
		return ans;
	}
	
}
