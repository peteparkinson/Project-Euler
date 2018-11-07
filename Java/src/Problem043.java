/* Project Euler, problem 43
 * 
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each
 * of the digits 0 to 9 in some order, but it also has a rather interesting sub-string
 * divisibility property.
 * 
 * Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the
 * following:
 * 
 * d2d3d4=406 is divisible by 2
 * d3d4d5=063 is divisible by 3
 * d4d5d6=635 is divisible by 5
 * d5d6d7=357 is divisible by 7
 * d6d7d8=572 is divisible by 11
 * d7d8d9=728 is divisible by 13
 * d8d9d10=289 is divisible by 17
 * 
 * Find the sum of all 0 to 9 pandigital numbers with this property.
 * 
 * answer = 16695334890;  //correct
 * this is just shameful
 */

import java.util.ArrayList;

public class Problem043 {
	public static void main(String[] args){
				
		ArrayList<String> digits = new ArrayList<String>();
		String check;
		long answer = 0;
		
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 8; b++) {
				for (int c = 0; c <= 7; c++) {
					for (int d = 0; d <= 6; d++) {
						for (int e = 0; e <= 5; e++) {
							for (int f = 0; f <= 4; f++) {
								for (int g = 0; g <= 3; g++) {
									for (int h = 0; h <= 2; h++) {
										for (int i = 0; i <= 1; i++) {
											
											check = "";
											for (int j = 0; j <= 9; j++) {
												digits.add(String.valueOf(j));
											}
											
											check += digits.get(a);
											digits.remove(a);
											check += digits.get(b);
											digits.remove(b);
											check += digits.get(c);
											digits.remove(c);
											check += digits.get(d);
											digits.remove(d);
											check += digits.get(e);
											digits.remove(e);
											check += digits.get(f);
											digits.remove(f);
											check += digits.get(g);
											digits.remove(g);
											check += digits.get(h);
											digits.remove(h);
											check += digits.get(i);
											digits.remove(i);
											check += digits.get(0);
											digits.remove(0);

											if(subDiv(check)){
												System.out.println(check);
												answer += Long.valueOf(check);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("answer: " + answer);
	}

	private static boolean subDiv(String check) {
		
		int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17 };
		String tmp;
		
		for (int i = 1; i <= 7; i++) {
			tmp = "";
			for (int j = 0; j < 3; j++) {
				tmp += check.charAt(i + j);
			}
			if(Integer.valueOf(tmp) % primes[i - 1] != 0){
				return false;
			}
		}
		return true;
	}
}
