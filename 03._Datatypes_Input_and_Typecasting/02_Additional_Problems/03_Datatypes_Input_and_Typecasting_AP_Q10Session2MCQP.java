/*

Q10. Session 2 MCQ P

Which of the following is incorrect ?

Choose the correct answer from below:

int n = scn.nextInt();

float n = scn.nextInt();

double n = scn.nextFloat();

float n = scn.nextDouble();

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
		System.out.println();
	}
}

// Answer :- Third one , double n = scn.nextFloat();

/*

The correct answer is:

double n = scn.nextFloat();

❌ Why it’s incorrect:
**scn.nextFloat()** returns a float, but you're trying to store
it in a double.

This seems fine because a float can be widened to a double, 
but in Java Scanner.nextFloat() returns a float, and 
double n = ... expects a double literal or value.

However, Java will not implicitly convert the return type 
of nextFloat() to double for variable declaration.

You'll get a type mismatch unless you explicitly cast it:

double n = (double) scn.nextFloat();  // OK with cast

✅ Valid statements:

int n = scn.nextInt(); → OK

float n = scn.nextInt(); → OK (int to float = widening)

float n = scn.nextDouble(); → OK only with explicit cast,
e.g., float n = (float) scn.nextDouble();

-------------------

Would you like a table showing common Scanner methods and 
compatible variable types?

Here's a helpful table of common Scanner methods in Java and 
the compatible variable types, including whether casting is required:

✅ Java Scanner Input Method Compatibility Table

Scanner Method		Returns Type			Can be Assigned To		Needs Casting?								Example
nextInt()				int							int, float, double				❌ (for float/double: widening)			float f = scn.nextInt();

nextFloat()				float						float								❌													float f = scn.nextFloat();

														double							✅													double d = (double) scn.nextFloat();

														int									✅ (may lose precision)					int i = (int) scn.nextFloat();

nextDouble()			double					double							❌													double d = scn.nextDouble();

														float								✅													float f = (float) scn.nextDouble();

														int									✅													int i = (int) scn.nextDouble();

nextLine()				String					String							❌													String s = scn.nextLine();

next()					String					String							❌													String s = scn.next();

 Notes:

Widening conversions (e.g., int → float, float → double) are automatic.

Narrowing conversions (e.g., double → float or int) require explicit casting and 
can cause data loss.

Use .nextLine() with care after numeric input — it may capture leftover newline characters.

*/
