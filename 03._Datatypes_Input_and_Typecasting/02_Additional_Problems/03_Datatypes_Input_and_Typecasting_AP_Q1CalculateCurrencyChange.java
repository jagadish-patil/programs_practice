/*

Q1. Calculate Currency Change

Problem Description

Your friend Rahul plans to visit exotic countries all around the world. 
Sadly, Rahul's math skills aren't good enough. Take the amount of money 
Rahul has before the currency exchange and the amount of money that is spent 
from his savings as input, print the amount of money that remains in his savings.

Input Format

The first line contains an integer N denoting the total savings, 
the amount of money before exchange.
The second line contains an integer M denoting the exchanging amount, 
denoting the amount of money that is spent from the savings.

Output Format

Print a single line denoting the amount of money that is left in his savings.
Problem Constraints

1 <= N <= 1000
1 <= M <= N

Example Input

Input:-
116
12

Example Output

Output:-
104

Note: The problem constraints mean that when we test your code, 
the test cases used in the backend can have input values only within
 those constraints. You need not implement them in your code. 
 You must ensure your code will work for all such input values!

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		int N, M, output;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		output = N - M;
		
		System.out.println(output);
	}
}
