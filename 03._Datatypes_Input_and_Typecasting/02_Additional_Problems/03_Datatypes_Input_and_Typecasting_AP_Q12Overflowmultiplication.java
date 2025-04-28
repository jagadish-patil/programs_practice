/*

Q12. Overflow multiplication

Problem Description
Given two numbers A and B. Multiply them and print the product.

Problem Constraints

105 <= A, B <= 106

Input Format
Two space separated integers A and B in the first line.

Output Format
Print in a single line the product of A and B.

Example Input

Input 1: 100000, 1000000

Input 2: 1000000, 10000000

Example Output

Output 1: 100000000000

Output 2: 10000000000000

Example Explanation

Explanation 1: 100000 * 1000000 = 100000000000.

Explanation 2: 1000000 * 10000000 = 10000000000000.

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		long A, B;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		long output = A * B;
		
		System.out.println(output);
	}
}
