/*

Q5. Sum 3

Problem Description
Given three numbers A, B and C. Add them and print the sum.


Input Format
Three space separated integers A, B, and C in the first line.


Output Format
Print in a single line the sum of A, B and C.



Example Input
Input 1: 2 3 -1

Input 2: 7 -4 0


Example Output
Output 1: 4

Output 2: 3


Example Explanation
Explanation 1: 2 + 3 + (-1) = 4.

Explanation 2: 7 + (-4) + 0 = 3.

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;

		System.out.println(sum);
		
	}
}
