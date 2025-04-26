/*

Q4. Total Elapsed Cooking Time

Problem Description

You wrote some code to help you cook a gorgeous lasagna 
from your favorite cookbook. Now, you want to find the 
total number of minutes you've been cooking for the sum 
of your preparation time and the time the lasagna has already spent
 baking in the oven. The preparation time of one layer is 2 minutes.
  Given the number of layers added to the lasagna and the number of
   minutes the lasagna has been baking in the oven, find the 
   total elapsed cooking time (prep + bake) in minutes.


Problem Constraints

1 <= N <= 20
0 <= M <= 40


Input Format

There are 2 lines in the input.
The first line contains the integer N denoting the number of layers.
The second line contains the integer M denoting the time the 
lasagna has already spent baking in the oven.


Output Format

Print in a single line the total elapsed cooking time.


Example Input

Input 1:-
3
20

Input 2:-
1
29


Example Output

Output 1:-
26

Output 2:-
31

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int output = 2 * N;
		
		int totalPrepTime = output + M;
		

		System.out. println(totalPrepTime);
		
	}
}
