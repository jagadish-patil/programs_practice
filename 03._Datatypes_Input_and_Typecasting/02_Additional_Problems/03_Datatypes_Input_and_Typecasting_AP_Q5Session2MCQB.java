/*

Q5. Session 2 - MCQ B

What is the result of a Narrowing Type Conversion in JAVA?

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

// Answer :- first one , Loss of Data

/*

The correct answer is:

Loss of Data

Explanation:
Narrowing Type Conversion in Java may result in loss of data 
because you're converting from a larger data type to a smaller data type. 
This can lead to truncation or overflow if the value doesn’t fit in the 
target type.

Example:

double d = 123.456;
int i = (int) d;  // i becomes 123, the fractional part is lost

*/
