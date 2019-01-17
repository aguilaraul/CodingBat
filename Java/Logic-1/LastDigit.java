/*
 * Given three ints, a b c, return true if two or more of them
 * have the same rightmost digit. The ints are non-negative.
 */
public class LastDigit {
	public boolean lastDigit(int a, int b, int c) {
  		int rA = a%10;
  		int rB = b%10;
  		int rC = c%10;
  		int counter = 0;

  		if(rA == rB) counter++;
 	 	if(rA == rC) counter++;
  		if(rB == rC) counter++;

  		if(counter >= 1) return true;
  		return false;
	}
}
