/* Project Euler, problem 40
 * An irrational decimal fraction is created by concatenating the positive
 * integers:	0.12345678910'1'112131415161718192021...
 * 
 * It can be seen that the 12th digit of the fractional part is 1.
 * 
 * If dn represents the nth digit of the fractional part, find the value of
 * the following expression.
 * 
 * d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 * 
 * answer = 210;  //correct
 */



public class Problem040 {
	public static void main(String[] args){
		
		int num = 0;
		int answer = 1;
		
		for (int i = 0; i <= 1000000; i++) {
			
			String iString = String.valueOf(i);
			int power = Integer.valueOf(iString.length());
			
			for (int j = 0; j < iString.length(); j++) {
				
				//seeks specific indexes (10, 100, etc).  "- j" cycles digits of the number
				if(num == Math.pow(10, power) - j){
					//System.out.println(iString.charAt(j));
					answer *= Integer.parseInt(String.valueOf(String.valueOf(iString.charAt(j))));
				}
			}
			num += power;
		}
		System.out.println(answer);
	}
}
