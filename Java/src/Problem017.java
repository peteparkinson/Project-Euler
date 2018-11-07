/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there
 * are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of
 * "and" when writing out numbers is in compliance with British usage.
 * 
 * answer: 21124 (correct)
 */

public class Problem017 {
	
	static int total = 0;
	
	public static void main(String[] args){
		
		for (int i = 1; i <= 1000; i++) {
			convert(i);
		}
		System.out.println(total);
	}
	
	private static void convert(int i) {

		int ones =  i % 10;
		int tens = (i % 100 - ones) / 10;
		int huns = (i -tens - ones) / 100;
		
		//Special cases
		if(i == 1000){
			// add 11
			total += 11;
		}
		else if(i % 100 == 10){
			// add 3
			total += 3;
		}
		else if(i % 100 == 11
			 || i % 100 == 12){
			// add 6
			total += 6;
		}
		else if(i % 100 == 13
			 || i % 100 == 14
			 || i % 100 == 18
			 || i % 100 == 19){
			// add 8
			total += 8;
		}
		else if(i % 100 == 15
			 || i % 100 == 16){
			// add 7
			total += 7;
		}
		else if(i % 100 == 17){
			// add 9
			total += 9;
		}
		else{
			//ones place
			filterOnes(ones);
			
			//tens place
			filterTens(tens);
		}
		//hundreds place
		if(huns > 0 && huns < 10){
			filterOnes(huns);
			if(ones == 0 && tens == 0){
				total += 7;
			}else{
				total += 10;
			}
		}
	}
	
	private static void filterOnes(int i) {
		
		if(i == 1
		|| i == 2
		|| i == 6){
			// add 3
			total += 3;
		}
		if(i == 3
		|| i == 7
		|| i == 8){
			// add 5
			total += 5;
		}
		if(i == 4
		|| i == 5
		|| i == 9){
			// add 4
			total += 4;
		}		
	}
	
	private static void filterTens(int i) {
		if(i == 2
		|| i == 3
		|| i == 8
		|| i == 9){
			// add 6
			total += 6;
		}
		if(i == 4  //spelled "forty" for some reason
		|| i == 5
		|| i == 6){
			// add 5
			total += 5;
		}
		if(i == 7){
			// add 7
			total += 7;
		}
	}
}
