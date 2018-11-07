import java.math.BigInteger;

/*Project Euler, problem 15
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 * 
 * Answer: 
 * ((2n)! / n!) / n! = paths
 * (40! / 20!) / 20! = 137846528820;  //correct
 * 
 */
public class Problem015 {
	
    public static void main(String args[])
    {
        int num = 20;
        //System.out.println(factorial(num));

        BigInteger a = factorial(num);
        BigInteger b = factorial(num * 2);
        BigInteger c = b.divide(a).divide(a); 
        
        System.out.println(c);        
    }
	
    static BigInteger factorial(int num)
    {
        BigInteger total = new BigInteger("1"); 
        for (int i = 2; i <= num; i++)
        	total = total.multiply(BigInteger.valueOf(i));
 
        return total;
    }
 
    
}
