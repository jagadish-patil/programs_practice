/*

Q7. Session 2 - MCQ D

Which of the following automatic type conversion will be possible?

Choose the correct answer from below:

float to int

int to long

long to int

double to int

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here		
		System.out.println();
	}
}

// Answer :- second one , long to int

/*

The correct answer is:

int to long

Explanation:
Only int to long is a widening type conversion, which Java allows automatically without explicit casting.

Let's review the options:

float to int – ❌ Not allowed automatically (narrowing, possible data loss)

int to long – ✅ Allowed automatically (widening, safe)

long to int – ❌ Not allowed automatically (narrowing)

double to int – ❌ Not allowed automatically (narrowing)

-----------

Here's a summary chart of Widening and Narrowing type conversions in Java:

✅ Widening Type Conversion (Automatic / Implicit)
Safe, no data loss. Happens automatically.


From Type	To Type(s)
byte		short, int, long, float, double
short		int, long, float, double
char		int, long, float, double
int			long, float, double
long		float, double
float		double

❌ Narrowing Type Conversion (Manual / Explicit)
Risk of data loss. Requires casting.


From Type	To Type(s)
double		float, long, int, short, byte, char
float		long, int, short, byte, char
long		int, short, byte, char
int			short, byte, char
short		byte, char

Example of Widening:

int a = 25;
long b = a;  // Automatic

Example of Narrowing:

double x = 9.99;
int y = (int) x;  // Manual casting, y becomes 9

*/
