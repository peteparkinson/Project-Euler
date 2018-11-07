import java.math.BigInteger;

/* Project Euler, problem 20
 * n! means n × (n - 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 * answer = 648;  //correct
 * 
 */


public class Problem020 {
	public static void main(String[] args){
		
		BigInteger product = factorial(100);
		String digits;
		int total = 0;
		
		digits = product.toString();
		
		for (int i = 0; i < digits.length(); i++) {
			total += Integer.parseInt(String.valueOf(digits.charAt(i)));
		}
		
		System.out.println(total);
		
	}

	 static BigInteger factorial(int num)
	    {
	        BigInteger total = new BigInteger("1"); 
	        for (int i = 2; i <= num; i++)
	        	total = total.multiply(BigInteger.valueOf(i));
	 
	        return total;
	    }
	
	
}
