/*
 * The number 6 is a truly great number. Given two int values,
 * a and b, return true if either one is 6. Or if their sum or
 * difference is 6.
 */
public boolean love6(int a, int b) {
	if(a == 6 || b == 6) return true;
	if(a+b == 6 || Math.abs(a-b) == 6) return true;
	return false;
}
