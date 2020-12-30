/* Project Euler, problem 67.
 * By starting at the top of the triangle below and moving to adjacent
 * numbers on the row below, the maximum total from top to bottom is 23.

	   3
	  7 4
	 2 4 6
	8 5 9 3

 * That is, 3 + 7 + 4 + 9 = 23.
 * Find the maximum total from top to bottom in triangle.txt (right click 
 * and 'Save Link/Target As...'), a 15K text file containing a triangle with 
 * one-hundred rows.
 * 
 * NOTE: This is a much more difficult version of Problem 18. It is not 
 * possible to try every route to solve this problem, as there are 299 
 * altogether! If you could check one trillion (1012) routes every second it 
 * would take over twenty billion years to check them all. There is an 
 * efficient algorithm to solve it. ;o)
 * 
 * answer = 7273;  //correct
 */

package projectEuler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Problem067 {
	public static void main(String[] args) {
		int[][] arr = new int[100][100];

		Scanner sc;
		try {
			sc = new Scanner(new BufferedReader(new FileReader(
					"C:\\Users\\PeteParkinson\\Desktop\\Dev\\Java\\projectEuler\\p067_triangle.txt")));
			for (int i = 0; i < 100; i++) {
				String[] line = sc.nextLine().trim().split(" ");
				for (int j = 0; j < line.length; j++) {
					arr[i][j] = Integer.parseInt(line[j]);
				}
			}
			
			for(int a = arr[0].length - 2; a >= 0; a--) {
				for(int b = 0; b < arr.length; b++) {
					if(arr[a][b] != 0) {
						if(arr[a+1][b] > arr[a+1][b+1]) {
							arr[a][b] += arr[a+1][b];
						} else {
							arr[a][b] += arr[a+1][b+1];
						}
					}
				}
			}
			System.out.println(arr[0][0]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
