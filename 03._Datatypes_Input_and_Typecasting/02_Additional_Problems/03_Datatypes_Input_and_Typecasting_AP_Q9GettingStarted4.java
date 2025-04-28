/*

Q9. Getting Started - 4

The given code gives a compilation error. 
Which of the following changes will remove the compilation error.

int a = 10, b = 5; //1

int c = (a * 1.0) / b; //2

System.out. println(c); //3

Choose the correct answer from below:

Change line 2 as : float c = (a * 1.0) / b;

Change line 2 as : double c = (a * 1.0) / b;

Change line 2 as : int c = a / b;

Both second and third options are correct

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		System.out.println();
	}
}

// Answer :- fourth one , Both second and third options are correct

/*

The correct answer is:

Both second and third options are correct

Let's analyze why:

Original problematic line:

int c = (a * 1.0) / b;

a * 1.0 promotes a to double, so the entire expression becomes a double.

You're trying to assign a double to an int without casting,
which causes a compilation error.

✅ Option 1:

float c = (a * 1.0) / b;

This works because the result of (a * 1.0) is double, 
and it's then divided by b, resulting in double.

A double can be assigned to a float with narrowing conversion, 
but a warning may occur unless explicitly cast.

Safer version:

float c = (float)((a * 1.0) / b);

✅ Option 2:

double c = (a * 1.0) / b;

This is perfectly valid.

double expression is being stored in a double variable — no error.

✅ Option 3:

int c = a / b;

This avoids floating-point arithmetic altogether.

Both a and b are int, so the result is an int, and it compiles fine.

✅ So:
"Both second and third options are correct" is the right choice.

-------------------------

Let's look at how the output differs for each version
of line 2 in your code:

Given:

int a = 10, b = 5;

✅ Option 1 (Using float):

float c = (float)((a * 1.0) / b);
System.out.println(c);

Output:
2.0

(a * 1.0) makes it 10.0 (a double)

10.0 / 5 = 2.0

Explicit cast to float keeps the decimal

Output is a floating-point number: 2.0

✅ Option 2 (Using double):

double c = (a * 1.0) / b;
System.out.println(c);

Output:

2.0

Everything is already in double precision

Clean, no cast needed

Output is also a floating-point number: 2.0

✅ Option 3 (Using int only):

int c = a / b;
System.out.println(c);

Output:

2

Integer division: 10 / 5 = 2

No decimal part — it’s truncated

Output is an integer: 2

Summary Table:

Option	Data Type	Result	Output
1		float		2.0		2.0
2		double		2.0		2.0
3		int			2		2

------------------------

Would you like to try a version where the result is 
not a whole number, like int a = 10, b = 3?

Let’s now change the inputs to:

int a = 10, b = 3;

This will help show the difference between integer and 
floating-point division more clearly.

1️⃣ Using float with explicit cast

float c = (float)((a * 1.0) / b);
System.out.println(c);

a * 1.0 → 10.0 (double), then divided by 3 → 10.0 / 3 = 3.333...

Casts result to float, so:

✅ Output:

3.3333333

2️⃣ Using double

double c = (a * 1.0) / b;
System.out.println(c);

Same logic as above but keeps full double precision:

✅ Output:

3.3333333333333335

3️⃣ Using int only (integer division)

int c = a / b;
System.out.println(c);

Integer division truncates the decimal part:

✅ Output:

3
 Final Summary Table:

Option	Expression					Type	Output
1		(float)((a * 1.0) / b)		float	3.3333333
2		(a * 1.0) / b				double	3.3333333333333335
3		a / b						int		3

*/
