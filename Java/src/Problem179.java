/* Problem 179
 * 
 * Find the number of integers 1 < n < 10^7, 
 * for which n and n + 1 have the same number of positive divisors. 
 * For example, 
 * 
 * 14 has the positive divisors 1, 2, 7, 14 
 * while 15 has 				1, 3, 5, 15
 * 
 * ans = 986262;  //correct
 * 
 */

public class Problem179 {
	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		int count = 0;

		for (int i = 2; i < 10000000; i++) {
			if (divisorCount(i) == divisorCount(i + 1)) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(System.currentTimeMillis() - start);
	}
	
	public static int divisorCount(int num) {
		int count = 2;
		for (int k = 2; k <= Math.sqrt(num); k++) {
			if (num % k == 0) {
				if (k != Math.sqrt(num)) {
					count += 2;
				} else {
					count += 1;
				}
			}
		}
		return count;
	}
}
