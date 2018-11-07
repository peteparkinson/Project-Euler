/* Project Eluer, problem 42
 * 
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1);
 * so the first ten triangle numbers are:
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * By converting each letter in a word to a number corresponding to its alphabetical
 * position and adding these values we form a word value. For example, the word value
 * for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we
 * shall call the word a triangle word.
 * 
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file
 * containing nearly two-thousand common English words, how many are triangle words?
 * 
 * answer = 162;  //correct
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem042 {

	
	public ArrayList<Integer> triangle;
	
	public static void main(String[] args) throws Exception{
		
		int answer = 0;
		
		File file = new File("./words.txt");
		Scanner sc = new Scanner(file);
		 
		//dumps file into array list
		ArrayList<String> word = new ArrayList<String>
			(Arrays.asList(sc.next().replaceAll ("\"", "").split(",")));
		
		for (int i = 0; i < word.size(); i++) {
			int wordValue = getWordValue(word.get(i));
			if(isTriangle(wordValue) || wordValue == 1){
				System.out.println(word.get(i) + " has the triangle value: " + wordValue);
				answer++;
			}
		}
		System.out.println("\nthere are " + answer + " triangle words.");
	}

	private static int getWordValue(String word) {

		int value = 0;
		for (int i = 0; i < word.length(); i++) {
			value += word.charAt(i) - 64;
		}
		return value;
	}

	private static boolean isTriangle(int value) {
		
		int tri = 1;
		
		for (int i = 2; i < value; i++) {
			tri += i;
			if(value == tri){
				return true;
			}
		}
		return false;
	}
}
