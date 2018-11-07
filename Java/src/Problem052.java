import java.util.Arrays;

/* Project Euler, problem 52
 * 
 * It can be seen that the number, 125874, and its double, 251748,
 * contain exactly the same digits, but in a different order.
 * 
 * Find the smallest positive integer, x, such that
 * 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 * 
 * answer = 142857;  //correct
 */



public class Problem052 {
	public static void main(String[] args){
		
		for (int i = 1; i < 1000000 + 1; i++) {
			if(check(i)){
				for (int j = 1; j <= 6; j++) {
					System.out.println(i * j);
					return;
				}
			}
		}
	}

	private static boolean check(int num) {

		//System.out.println("checking: " + num);
		
		for (int i = 2; i <= 6; i++) {
			
			String number = String.valueOf(num);
			String comp = String.valueOf(num * i);
			char[] tmp1 = new char[number.length()];
			char[] tmp2 = new char[number.length()];
			
			for (int j = 0; j < number.length(); j++) {
				tmp1[j] = number.charAt(j);
				tmp2[j] = comp.charAt(j);
			}

			Arrays.sort(tmp1);
			Arrays.sort(tmp2);
			
			if(!Arrays.equals(tmp1,tmp2)){
				return false;
			}
		}
		
		return true;
	}

}
