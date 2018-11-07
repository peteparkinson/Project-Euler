/* Project Euler, problem 38
 * 
 * Take the number 192 and multiply it by each of 1, 2, and 3:
 * 
 * 192 × 1 = 192
 * 192 × 2 = 384
 * 192 × 3 = 576
 * 
 * By concatenating each product we get the 1 to 9 pandigital, 192384576.
 * We will call 192384576 the concatenated product of 192 and (1,2,3)
 * 
 * The same can be achieved by starting with 9 and multiplying by
 * 1, 2, 3, 4, and 5,giving the pandigital, 918273645, which is the
 * concatenated product of 9 and (1,2,3,4,5).
 * 
 * What is the largest 1 to 9 pandigital 9-digit number that can be formed
 * as the concatenated product of an integer with (1,2, ... , n) where n > 1?
 * 
 * answer = 932718654;  //correct
 */


public class Problem038 {
	public static void main(String[] args){
		
		int n = 2;
		int answer = 0;
		
		for (int i = 334; i < 9999; i++) {
			String products = "";
			if(!String.valueOf(i).contains("0")){				
				for (int j = 1; j <= n; j++) {
					products += String.valueOf(i * j);
				}
			}
			if(Tools.isPandigital(products, 1, 9)){
				answer = Integer.parseInt(products);
				System.out.println(i + " " + i*2);
			}
		}
		System.out.println("answer: " + answer);
	}
}
