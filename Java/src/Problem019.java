/* Project Euler, problem 19
 * 
 * You are given the following information, but you may prefer to do some research for yourself.
 * 
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * 
 * answer = 171;  //correct
 */

public class Problem019 {
	public static void main(String[] args){

	int[] months = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int days = 0;
	int answer = 0;
	
	for (int i = 1901; i < 2000; i++) {
		if(i % 4 == 0){
			months[1] = 29;
		}else{
			months[1] = 28;
		}
		for (int j = 0; j < months.length; j++) {
			days += months[j];
			if((days + 1) % 7 == 0){
				answer++;
			}
		}
	}
	System.out.println(answer);
	}
}
