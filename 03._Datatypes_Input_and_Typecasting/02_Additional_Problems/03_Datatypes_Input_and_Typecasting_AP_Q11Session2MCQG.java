/*

Q11. Session 2 MCQ G

What is the output of the JAVA code snippet?

int a = 10, b = 5, c = 3;

int d = a + c / 2 * b;

System.out.println(d);

Choose the correct answer from below:

17.5

32.5

15

30

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		int a = 10, b = 5, c = 3;

		int d = a + c / 2 * b;

		System.out.println(d);
		System.out.println();
	}
}

// Answer :- Third one , 15

/*

The correct answer is:

15

 Let's break down the code:

int a = 10, b = 5, c = 3;

int d = a + c / 2 * b;

System.out.println(d);

 Operator Precedence in Java:

/ and * have higher precedence than +

Operations of the same precedence are evaluated left to right

 Step-by-step evaluation:

d = a + c / 2 * b;

Substitute values:

d = 10 + 3 / 2 * 5;

Now evaluate left to right:

3 / 2 → 1 (since both are integers, result is integer division)

1 * 5 → 5

10 + 5 → 15

✅ Final Output:

15

--------

Would you like a quick reference guide to Java operator precedence rules?

Here’s a Java Operator Precedence Reference Guide to help you understand how expressions are evaluated:

 Java Operator Precedence Table (from highest to lowest)

Precedence Level	Operators					Description							Associativity
1 (Highest)			()								Parentheses (for grouping)		Left to Right
2							++, --						Unary postfix							Left to Right
3							+, -, ++, --, ~, !		Unary prefix							Right to Left
4							*, /, %						Multiplicative							Left to Right
5							+, -							Additive									Left to Right
6							<<, >>, >>>			Shift operators						Left to Right
7							<, <=, >, >=			Relational								Left to Right
8							==, !=						Equality									Left to Right
9							&								Bitwise AND							Left to Right
10							^								Bitwise XOR							Left to Right
11							`								`											Bitwise OR
12							&&							Logical AND							Left to Right
13							`																			`
14							?:								Ternary conditional					Right to Left
15							=, +=, -=, etc.			Assignment operators				Right to Left
16 (Lowest)			,								Comma operator					Left to Right

Tips:

Always use parentheses () to clarify complex expressions.

Integer division discards the decimal part.

Logical operators (&&, ||) are short-circuiting.

*/
