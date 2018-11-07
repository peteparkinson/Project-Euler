/* Project Euler, problem 13
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 *
 * the numbers are saved in "Problem13.txt"
 * 
 * answer: 5537376230;  //correct
 */

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem013 {
	public static void main(String[] args)throws Exception{

		File file = new File("./Problem13.txt");
		Scanner sc = new Scanner(file);
		String tmp;
		
		BigInteger[] num = new BigInteger[100];
		BigInteger total = new BigInteger("0");
		
		for (int i = 0; i < 100; i++) {
			num[i] = new BigInteger(sc.nextLine());
		}
		
		for (int i = 0; i < 100; i++) {
			total = total.add(num[i]);
		}
		tmp = String.valueOf(total);
		System.out.println(tmp.substring(0, 10));
	}
}
