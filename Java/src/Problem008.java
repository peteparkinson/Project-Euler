/*Project Euler, problem 8
 * 
 * The four adjacent digits in the 1000-digit number that have
 * the greatest product are 9 � 9 � 8 � 9 = 5832.
 * 
 * 731671765313306249192251196744265747423553491949349698352031
 * 277450632623957831801698480186947885184385861560789112949495
 * 459501737958331952853208805511125406987471585238630507156932
 * 909632952274430435576689664895044524452316173185640309871112
 * 172238311362229893423380308135336276614282806444486645238749
 * 303589072962904915604407723907138105158593079608667017242712
 * 188399879790879227492190169972088809377665727333001053367881
 * 220235421809751254540594752243525849077116705560136048395864
 * 467063244157221553975369781797784617406495514929086256932197
 * 846862248283972241375657056057490261407972968652414535100474
 * 821663704844031998900088952434506585412275886668811642717147
 * 992444292823086346567481391912316282458617866458359124566529
 * 476545682848912883142607690042242190226710556263211111093705
 * 442175069416589604080719840385096245544436298123098787992724
 * 428490918884580156166097919133875499200524063689912560717606
 * 058861164671094050775410022569831552000559357297257163626956
 * 1882670428252483600823257530420752963450
 * 
 * Find the thirteen adjacent digits in the 1000-digit number
 * that have the greatest product. What is the value of this product?
 * 
 * answer = 23514624000  //correct
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Problem008 {
	public static void main(String[] args) throws Exception{

		int[] digits = new int[1000];
		String number = "";
		long  answer = 0;
		//place file "Problem008 in 1 folder above "src"
		File file = new File("./Problem008.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			number = sc.next();
		}
		for (int i = 0; i < number.length(); i++) {
			digits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
		}
		for (int i = 0; i < digits.length; i++) {
			System.out.println(digits[i]);
		}
		
		for (int i = 0; i < 988; i++) {
			long tmp = 1;
			for (int j = i; j < i + 13; j++) {
				tmp *= digits[j];

				System.out.print(j + ": " + digits[j]);
				System.out.println(": " + tmp);
			}
			if(tmp > answer) {
				answer = tmp;
			}
		}
		System.out.println(answer);
	}
}
