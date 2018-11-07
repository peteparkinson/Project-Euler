/* Project Euler, problem 33
 * 
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting
 * to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by
 * canceling the 9s.
 * 
 * We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 * 
 * There are exactly four non-trivial examples of this type of fraction, less than one in
 * value, and containing two digits in the numerator and denominator.
 * 
 * If the product of these four fractions is given in its lowest common terms, find the
 * value of the denominator.
 * 
 * answer = 100;  //correct
 */

public class Problem033 {
	public static void main(String[] args){

		int numerator = 1;
		int denominator = 1;
		
		for (int denom = 10; denom <= 99; denom++) {
			for (int num = 10; num <= 99; num++) {
				
				if(num < denom
				&& num % 10 != 0			//ignores 0 in 1's place
				&& denom % 10 != 0
				&& num % 10 == denom / 10	//filters for like numbers in num 1's place / denom 10's place
				&& (num / 10) / (Double.valueOf(denom) % 10) == num / Double.valueOf(denom)){
					numerator *= num;
					denominator *= denom;
				}
			}
		}
		//reduces evenly
		System.out.println(denominator / numerator);
	}
}
