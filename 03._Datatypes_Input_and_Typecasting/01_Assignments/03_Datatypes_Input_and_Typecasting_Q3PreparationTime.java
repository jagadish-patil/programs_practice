/*

Q3. Preparation Time

Problem Description

You'll write some code to help you cook a gorgeous lasagna 
from your favorite cookbook. Now, you also want to add a few 
layers to the lasagna. Assume **each layer takes 2 minutes** to
 prepare. Given the number of layers you want to add to the lasagna, 
 find how many minutes you would spend making them.


Input Format

The only first line contains the integer N denoting the number of layers.


Output Format

Print in a single line how many minutes are required to prepare N layers.


Example Input

Input:-
2


Example Output

Output:-
4


Example Explanation

Note: The problem constraints mean that when we test your code, 
the test cases used in the backend can have input values only within
 those constraints. You need not implement them in your code. You must
  ensure your code will work for all such input values!

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int output = 2 * N;

		System.out. println(output);
		
	}
}
