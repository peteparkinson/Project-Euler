/*Project Euler, problem 22
 * 
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing
 * over five-thousand first names, begin by sorting it into alphabetical order. Then
 * working out the alphabetical value for each name, multiply this value by its alphabetical
 * position in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth
 * 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a
 * score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * answer = 871198282  //correct
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Problem022 {
	public static void main(String[] args) throws Exception{

		int answer = 0;
		String[] names = new String[5163];
		try{
			BufferedReader in = new BufferedReader(new FileReader
					("./names.txt"));
			String s = in.readLine();
			names = s.split(",");
		}catch(Exception e){
		    e.printStackTrace();
		}
		
		Arrays.sort(names);
		
		for (int i = 0; i < names.length; i++) {
			answer += (getScore(names[i]) * (i + 1));
		}
		System.out.println(answer);
	}

	private static int getScore(String name) {
		
		int score = 0;
		
		for (int i = 0; i < name.length(); i++) {
			score += name.charAt(i) - 64;
		}
		return score;
	}
}
