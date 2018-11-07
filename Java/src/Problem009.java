
/* Project Euler, problem 9
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * answer = 31875000;  //correct
 * 
 */

public class Problem009 {
	public static void main(String[] args) {

		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				for (int c = 1; c < 1000; c++) {
					if((a * a) + (b * b) == (c * c) 
							&& a + b + c == 1000
							&& a < b
							&& b < c) {
						System.out.print(a + " + ");
						System.out.print(b + " + ");
						System.out.println(c + " = " + 1000);
						System.out.println("a * b * c = " + a * b * c);
					}
				}
			}
		}
	}
}
