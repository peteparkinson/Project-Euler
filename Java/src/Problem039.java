/* Project Euler, problem 39
 * 
 * If p is the perimeter of a right angle triangle with integral length sides,
 * {a,b,c}, there are exactly three solutions for p = 120.
 * 
 * {20,48,52}, {24,45,51}, {30,40,50}
 * 
 * For which value of p <= 1000, is the number of solutions maximized?
 * 
 * answer = 840;  //correct
 */



public class Problem039 {
	public static void main(String[] args){
		
		int[] perimSolutions = new int[1000];
		int answer = 0;
		
		for (int p = 1; p <= 1000; p++) {
			
			for (int a = 1; a <= p / 2; a++) {
				for (int b = a + 1; b <= p / 2; b++) {
					double c = Math.sqrt(a*a + b*b);
					if(a + b + c == p){
						perimSolutions[p - 1]++;
					}
				}
			}
		}
		for (int i = 0; i < 1000; i++) {
			if(perimSolutions[i] > perimSolutions[answer]){
				answer = i;
			}
		}
		System.out.println("perimeter: " + (answer + 1) + " has " + perimSolutions[answer] + " solutions.");
		
		
	}
}
