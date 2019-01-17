/*
 * Given two ints, each in the range 10..99, return true if
 * there is a digit that appears in both numbers, such as
 * the 2 in 12 and 23.
 */
public boolean shareDigit(int a, int b) {
  	int aFirst = a/10;
  	int aSecond = a%10;

  	if( (aFirst == b/10 || aFirst == b%10) || (aSecond == b/10 || aSecond == b%10)) { return true; }
	return false;
}

