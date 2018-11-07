/* Project Euler, problem 31
 * In England the currency is made up of pound, £, and pence, p, and
 * there are eight coins in general circulation:
 * 
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * It is possible to make £2 in the following way:
 * 
 * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
 * How many different ways can £2 be made using any number of coins?
 * 
 * answer = 73682;  //correct
 */

public class Problem031 {
	public static void main(String[] args){
		
		int target = 200;
		int count = 0;
		
		//there is a way to clean this up, please revisit
		//int[] coin = new int[]{ 1, 2, 5, 10, 20, 50, 100, 200 };
		
		
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 2; j++) {
				for (int j2 = 0; j2 <= 4; j2++) {
					for (int k = 0; k <= 10; k++) {
						for (int k2 = 0; k2 <= 20; k2++) {
							for (int l = 0; l <= 40; l++) {
								for (int l2 = 0; l2 <= 100; l2++) {
									for (int m = 0; m <= 200; m++) {
										if(i * 200 +
										   j * 100 +
										   j2 * 50 +
										   k * 20 +
										   k2 * 10 +
										   l * 5 +
										   l2 * 2 +
										   m == target){
											count++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
