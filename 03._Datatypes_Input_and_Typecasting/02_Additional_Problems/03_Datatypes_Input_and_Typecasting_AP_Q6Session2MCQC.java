/*

Q6. Session 2 - MCQ C

What is the result of a Widening Type Conversion in JAVA?

Choose the correct answer from below:

Loss of Data

Gain of Data

No change

None of the above

*/

import java.lang.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here		
		System.out.println();
	}
}

// Answer :- third one , No change

/*

The correct answer is:

No change

Explanation:
Widening Type Conversion in Java is safe and does not result in data loss. 
It happens automatically when a value of a smaller data type is converted 
to a larger data type (e.g., int to long, float to double). 
The value remains intact and no information is lost.

Example:

java
Copy
Edit
int i = 100;
long l = i;  // Widening conversion, no data is lost

*/
